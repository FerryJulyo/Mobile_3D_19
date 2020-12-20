package ferry.julyo.wildriftmastery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    private void initial(){

    }

    public void Info(View view){
        Intent i = new Intent(HomeActivity.this, AboutActivity.class);
        startActivity(i);
    }

    public void Champion(View view){
        Intent i = new Intent(HomeActivity.this, ChampionActivity.class);
        startActivity(i);
    }

    public void AboutUs(View view){
        Intent i = new Intent(HomeActivity.this, InfoActivity.class);
        startActivity(i);
    }
}
