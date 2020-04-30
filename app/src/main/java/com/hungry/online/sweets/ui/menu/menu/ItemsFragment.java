package com.hungry.online.sweets.ui.menu.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hungry.online.sweets.R;

import java.util.ArrayList;

public class ItemsFragment extends Fragment {

    TextView add, sub, total;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_non_veg, container, false);

        add = view.findViewById(R.id.add_amount);
        sub = view.findViewById(R.id.sub_amount);
        total = view.findViewById(R.id.total_amount);


        ArrayList<String> ItemsMenu = new ArrayList<>();
        ItemsMenu.add("chicken");
        ItemsMenu.add("mutton MAsala");
        ItemsMenu.add("Egg MAsala");
        ItemsMenu.add("fish MAsala");
        

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewNonVeg);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ItemsAdapter itemsAdapter = new ItemsAdapter(getActivity(),ItemsMenu);
        recyclerView.setAdapter(itemsAdapter);

        return view;
    }
}
