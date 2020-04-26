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

public class NonVegAdapter extends RecyclerView.Adapter<NonVegAdapter.ViewHolder> {

    private List<String> data;
    private LayoutInflater layoutInflater;
    public NonVegAdapter(Context context, List<String> data) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String ButterPanner = data.get(position);
        holder.itemname.setText(ButterPanner);
        holder.itemprice.setText(ButterPanner);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemname, itemprice;
        public ViewHolder(View view) {
            super(view);
            itemname = view.findViewById(R.id.menuname);
            itemprice = view.findViewById(R.id.menuprice);
        }
    }
}
