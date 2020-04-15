package com.hungry.online.sweets.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.hungry.online.sweets.model.item_menu;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> item;

    public HomeViewModel() {

    }

    public LiveData<String> getText() {
        return item;
    }
}