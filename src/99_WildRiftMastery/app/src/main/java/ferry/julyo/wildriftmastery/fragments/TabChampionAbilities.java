package ferry.julyo.wildriftmastery.fragments;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ferry.julyo.wildriftmastery.ChampionInfoActivity;
import ferry.julyo.wildriftmastery.R;
import ferry.julyo.wildriftmastery.adapter.ChampionAbilityAdapter;
import ferry.julyo.wildriftmastery.data.Champion;


public class TabChampionAbilities extends Fragment {
    private Champion champion;
    private RecyclerView abilitiesRecyclerView;
    private ChampionAbilityAdapter championAbilityAdapter;

    public static TabChampionAbilities newInstance(Champion champion) {
        TabChampionAbilities fragment = new TabChampionAbilities();
        Bundle args = new Bundle();
        args.putSerializable(ChampionInfoActivity.PARAM_CHAMPION, champion);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.champion = (Champion) getArguments().getSerializable(ChampionInfoActivity.PARAM_CHAMPION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_champion_abilities, container, false);
        this.abilitiesRecyclerView = fragmentView.findViewById(R.id.fragment_champion_abilities_recycler_view);

        if (this.champion != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fragmentView.getContext());

            this.championAbilityAdapter = new ChampionAbilityAdapter(this.champion.getAbilities());
            this.abilitiesRecyclerView.setAdapter(this.championAbilityAdapter);
            this.abilitiesRecyclerView.setLayoutManager(linearLayoutManager);
        }

        return fragmentView;
    }
}
