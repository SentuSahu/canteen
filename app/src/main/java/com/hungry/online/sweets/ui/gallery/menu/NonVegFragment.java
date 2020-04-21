package com.hungry.online.sweets.ui.gallery.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hungry.online.sweets.R;

import java.util.ArrayList;

public class NonVegFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_non_veg, container, false);

        ArrayList<String> NonVegItems = new ArrayList<>();
        NonVegItems.add("chicken");
        NonVegItems.add("mutton MAsala");
        NonVegItems.add("Egg MAsala");
        NonVegItems.add("fish MAsala");

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewNonVeg);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        NonVegAdapter nonVegAdapter = new NonVegAdapter(getActivity(),NonVegItems);
        recyclerView.setAdapter(nonVegAdapter);

        return view;
    }
}
