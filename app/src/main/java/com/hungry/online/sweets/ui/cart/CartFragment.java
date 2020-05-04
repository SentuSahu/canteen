package com.hungry.online.sweets.ui.cart;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.hungry.online.sweets.R;
import com.hungry.online.sweets.model.CartDTO;
import com.hungry.online.sweets.ui.menu.menu.ItemsAdapter;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {
    private CartDTO cartDTO = new CartDTO();

    private TextView item, rate;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        item = root.findViewById(R.id.itemCart);
        rate = root.findViewById(R.id.rateCart);
        item.setText(cartDTO.getItem());
//        rate.setText(cartDTO.getTotal());

        Log.d("cart","values : " + cartDTO.getItem().toString() + " " + cartDTO.getTotal());


        return root;
    }


}
