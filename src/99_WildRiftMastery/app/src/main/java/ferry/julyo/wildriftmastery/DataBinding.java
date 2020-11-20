package ferry.julyo.wildriftmastery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DataBinding extends Activity {
    private ImageButton btnChampion, btnItem, btnVoice, btnWallpaper;

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChampion = (ImageButton) findViewById(R.id.btnCham);
        btnItem = (ImageButton) findViewById(R.id.btnItem);
        btnVoice = (ImageButton) findViewById(R.id.btnVoice);
        btnWallpaper = (ImageButton)

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutFragment();
            }
        });



        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setHero(getCurrentTitle());
        activityMainBinding.setTipe(getCurrentTitle());
        activityMainBinding.setRole(getCurrentTitle());
    }

    public void AboutFragment(){
        Intent intent = new Intent(this, AboutFragment.class);
        startActivity(intent);
    }

    private Title getCurrentTitle(){
        Title title = new Title();
        title.setBtnHeroName("Hero");
        title.setBtnTipeName("Tipe");
        title.setBtnRoleName("Role");
        return title;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
