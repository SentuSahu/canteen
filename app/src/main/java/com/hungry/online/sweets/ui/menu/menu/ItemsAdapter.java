package com.hungry.online.sweets.ui.menu.menu;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.hungry.online.sweets.R;
import com.hungry.online.sweets.model.CartDTO;
import com.hungry.online.sweets.ui.cart.CartFragment;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private int rate = 0;
    private List<String> data;
    private LayoutInflater layoutInflater;
    public ItemsAdapter(Context context, List<String> data) {
        this.data = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.nonveg_recycleview_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        String ButterPanner = data.get(position);
        holder.textView.setText(ButterPanner);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate = rate + 120;
                Log.d("total","click success  : "+ rate + holder.textView.getText());

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView, count;
        Button btn, checkout;
        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.row);
            btn = view.findViewById(R.id.menuadd);
            checkout = view.findViewById(R.id.checkout);
        }
    }
}
