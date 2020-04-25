package com.hungry.online.sweets.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hungry.online.sweets.R;
import com.hungry.online.sweets.model.ItemMenu;
import com.hungry.online.sweets.ui.PostActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private List<ItemMenu> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private HomeAdapter mAdapter;


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

//        recyclerView = root.findViewById(R.id.recycleView_item_menu);
//        mAdapter = new HomeAdapter(itemList);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(mAdapter);
//        item_menu item = new item_menu("chai","10 $");


//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
////                textView.setText(s);
//            }
//        });



        return root;
    }

}
