package com.hungry.online.sweets.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> item;

    public HomeViewModel() {

    }

    public LiveData<String> getText() {
        return item;
    }
}