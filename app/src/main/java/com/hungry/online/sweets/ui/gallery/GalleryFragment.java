package com.hungry.online.sweets.ui.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.hungry.online.sweets.R;
import com.hungry.online.sweets.ui.gallery.menu.NonVegFragment;
import com.hungry.online.sweets.ui.gallery.menu.VegFragment;

public class GalleryFragment extends Fragment implements View.OnClickListener {

    Button Vbutton, NVbutton;
    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        Vbutton = root.findViewById(R.id.vegButton);
        NVbutton = root.findViewById(R.id.nonVegButton);

        Vbutton.setOnClickListener(this);
        NVbutton.setOnClickListener(this);



        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.vegButton){
            VegFragment fragment = new VegFragment();

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
//            FragmentManager fragmentManager = getChildFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.replace(R.id.frameLayout,fragment);
//            fragmentTransaction.commit();
            Log.d("debug","successfully commit VEG");
        }
        else{
            NonVegFragment fragment = new NonVegFragment();

            getFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
//            FragmentManager fragmentManager = getChildFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.replace(R.id.frameLayout, fragment);
//            fragmentTransaction.commit();
            Log.d("debug","successfully commit NON veg");
        }

    }
}
