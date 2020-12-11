package com.ferry.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.ferry.recyclerview.HeroAdapter;
import com.ferry.recyclerview.DataHero;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity implements HeroAdapter.OnUnsClickListener{

    public static final String Key_TabelActivity="Key_TabelActivity";

    public RecyclerView rv;
    public HeroAdapter heroAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<DataHero> dataHeroList = new ArrayList<>();
    public EditText searchView;
    public CharSequence search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.heroList);
        EditText search_bar = findViewById(R.id.search_bar);
        dataHeroList.add(new DataHero("Ahri","The Nine Tailed Fox \n\n" +
                "Health      526-2090              Mana        418-843     \n" +
                "H.Regen     5.5-15.7              M.Regen     8-21.6      \n" +
                "Armor       20.88-80.38           Attack     53.04-104.04\n\n" +

                " \"Human emotions can be more volatile than even the deepest magic.\" \n" +
                "Innately connected to the latent power of Runeterra, Ahri is a vastaya who can reshape magic into orbs orbs of raw energy.\n" +
                "She revels in toying with her prey by manipulating their emotions before devouring their life essence\n" +
                "Despite her predatory nature, Ahri retains a sense of empathy as she receives flashes of memory from each soul she consumes.", R.drawable.ahri , R.drawable.ahrifull));

        dataHeroList.add(new DataHero("Jinx","Lorem ipsum\n" +
                "Lorem ipsum \n" +
                "Lorem ipsum", R.drawable.jinx, R.drawable.jinxfull));

        dataHeroList.add(new DataHero("Garen","Lorem ipsum\n" +
                "Lorem ipsum \n" +
                "Lorem ipsum", R.drawable.garen, R.drawable.garenfull));

        dataHeroList.add(new DataHero("Lux","Lorem ipsum\n" +
                "Lorem ipsum \n" +
                "Lorem ipsum", R.drawable.lux, R.drawable.luxfull));

        dataHeroList.add(new DataHero("Yasuo","Lorem ipsum\n" +
                "Lorem ipsum \n" +
                "Lorem ipsum", R.drawable.yasuo, R.drawable.yasuofull));

        heroAdapter = new HeroAdapter(dataHeroList);
        heroAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(heroAdapter);
        rv.setLayoutManager(layoutManager);



    }





    @Override
    public void onClick(View view, int position) {
        DataHero datahero = dataHeroList.get(position);
        Intent i = new Intent(MainActivity.this,HeroActivity.class);
        i.putExtra(Key_TabelActivity,datahero);
        startActivity(i);
    }
}