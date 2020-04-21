package com.hungry.online.sweets.ui.gallery.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hungry.online.sweets.R;

import java.util.List;

public class VegAdapter extends RecyclerView.Adapter<VegAdapter.ViewHolder> {
    private List<String> data;
    private LayoutInflater layoutInflater;

    public VegAdapter(Context context, List<String> data) {
        this.data = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VegAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.veg_recycleview_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VegAdapter.ViewHolder holder, int position) {
        String ButterChicken = data.get(position);
        holder.textView.setText(ButterChicken);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.row);
        }
    }
}
