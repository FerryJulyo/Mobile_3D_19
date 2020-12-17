package ferry.julyo.wildriftmastery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ferry.julyo.wildriftmastery.adapter.ChampionAdapter;
import ferry.julyo.wildriftmastery.api.ApiClient;
import ferry.julyo.wildriftmastery.api.responses.ChampionResponse;
import ferry.julyo.wildriftmastery.api.responses.ChampionsResponse;
import ferry.julyo.wildriftmastery.data.Champion;
import ferry.julyo.wildriftmastery.task.LoadAllChampionsTask;

public class ChampionActivity extends AppCompatActivity implements View.OnClickListener, ChampionAdapter.OnChampionClickListener, LoadAllChampionsTask.LoadAllChampionsTaskDelegate, SearchView.OnQueryTextListener {
    private List<Champion> dataSource;
    private ChampionAdapter championAdapter;
    private ProgressDialog progressDialog;
    private SearchView filterSearchView;
    private LoadAllChampionsTask loadAllChampionsTask;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champion);

        back = (ImageButton) findViewById(R.id.back);

        this.filterSearchView = findViewById(R.id.activity_main_filter_search_view);
        RecyclerView championRecyclerView = this.findViewById(R.id.activity_main_champion_recycler_view);

        this.dataSource = new ArrayList<>();
        this.championAdapter = new ChampionAdapter(this.dataSource, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        championRecyclerView.setAdapter(this.championAdapter);
        championRecyclerView.setLayoutManager(linearLayoutManager);

        this.loadAllChampionsTask = new LoadAllChampionsTask(this);
        this.loadAllChampionsTask.execute();

        this.filterSearchView.setOnQueryTextListener(this);
        this.progressDialog = ProgressDialog.show(this, getString(R.string.wait), getResources().getString(R.string.loading));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent  pindah = new Intent(ChampionActivity.this, HomeActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onChampionClick(int position) {
        Intent intent = new Intent(this, ChampionInfoActivity.class);

        intent.putExtra(ChampionInfoActivity.PARAM_CHAMPION_ID, this.championAdapter.getDataSource().get(position).getName());
        intent.putExtra(ChampionInfoActivity.PARAM_CHAMPIONS, (Serializable) this.dataSource);
        startActivity(intent);
    }

    @Override
    public void onSuccess(ChampionsResponse response) {
        this.progressDialog.dismiss();

        Toast.makeText(this, getString(R.string.toast_total_loaded_champions, response.getData().size()), Toast.LENGTH_SHORT).show();

        this.dataSource.clear();

        for (ChampionResponse cr : response.getData().values()) {
            Champion champion = new Champion.Builder()
                    .withChampionResponse(cr)
                    .withBaseImageUrl(ApiClient.BASE_URL_IMAGE)
                    .build();

            this.dataSource.add(champion);
        }

        this.championAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFailure(@StringRes int resourceId) {
        Toast.makeText(this, resourceId, Toast.LENGTH_SHORT).show();
        this.progressDialog.dismiss();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        List<Champion> filteredChampions = new ArrayList<>();

        for (Champion champion : this.dataSource) {
            if (champion.getName().toLowerCase().startsWith(query.toLowerCase())) {
                filteredChampions.add(champion);
            }
        }

        this.championAdapter.updateDataSource(filteredChampions);

        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (newText.isEmpty()) {
            this.championAdapter.updateDataSource(this.dataSource);
            return true;
        }
        return false;
    }
}