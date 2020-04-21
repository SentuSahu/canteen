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

public class VegFragment extends Fragment {
    public VegFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_veg, container, false);
        ArrayList<String> VegItems = new ArrayList<>();
        VegItems.add("Panner MAsala");
        VegItems.add("Panner MAsala");
        VegItems.add("Panner MAsala");
        VegItems.add("Panner MAsala");

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewVeg);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        NonVegAdapter nonVegAdapter = new NonVegAdapter(getActivity(),VegItems);
        recyclerView.setAdapter(nonVegAdapter);
        onDestroy();

        return view;


    }
}
