package com.ferry.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ferry.recyclerview.DataHero;
import java.security.Key;

public class HeroActivity extends AppCompatActivity {
    TextView nama_hero, namaher, desc;
    ImageView gbr_hero;
    public static final String Key_TabelActivity = "Key_TabelActivity";
    DataHero datahero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);

        nama_hero = findViewById(R.id.nama_hero);
        namaher = findViewById(R.id.namaher);
        desc = findViewById(R.id.desc);
        gbr_hero = findViewById(R.id.gbr_hero);

        datahero = getIntent().getParcelableExtra(Key_TabelActivity);

        nama_hero.setText(datahero.getnamaHero());
        namaher.setText(datahero.getnamaHero());
        gbr_hero.setImageResource(datahero.getGbrHero());
        desc.setText(datahero.getDescp());
        initial();

    }

    private void initial() {

    }

    public void onClickBack(View view) {
        Intent intent = new Intent(HeroActivity.this, com.ferry.recyclerview.MainActivity.class);
        startActivity(intent);
    }
}
