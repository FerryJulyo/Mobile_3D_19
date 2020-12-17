package ferry.julyo.wildriftmastery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private ImageButton aboutUs, champion, info;

    Intent pindah;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        champion = (ImageButton) findViewById(R.id.btnCham);
        aboutUs =(ImageButton) findViewById(R.id.btnAboutUs);
        info = (ImageButton) findViewById(R.id.btnInfo);


        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        champion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(HomeActivity.this, ChampionActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(HomeActivity.this, InfoActivity.class);
                startActivity(pindah);
                finish();
            }
        });



}
}
