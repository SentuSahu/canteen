package com.hungry.online.sweets.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.hungry.online.sweets.R;
import com.hungry.online.sweets.ui.cart.CartFragment;
import com.hungry.online.sweets.ui.menu.menu.ItemsFragment;

public class MenuFragment extends Fragment implements View.OnClickListener {

    Button checkoutBtn, menubtn ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        // frame layout
        ItemsFragment fragment = new ItemsFragment();
        getFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();

        checkoutBtn = root.findViewById(R.id.checkout);
        menubtn = root.findViewById(R.id.menuadd);
        checkoutBtn.setOnClickListener(this);
//        menubtn.oncl


        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.checkout){
            CartFragment cartFragment = new CartFragment();
            assert getFragmentManager() != null;
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.parentlayout, cartFragment)
                    .commit();
        }

    }
}

