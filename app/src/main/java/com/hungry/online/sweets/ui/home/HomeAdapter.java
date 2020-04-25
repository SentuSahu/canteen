package com.hungry.online.sweets.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hungry.online.sweets.R;
import com.hungry.online.sweets.model.ItemMenu;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private List<ItemMenu> itemlist;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView itemName, itemPrice;

        private MyViewHolder(View view){
            super(view);
            itemName = view.findViewById(R.id.itemOnetextView);
            itemPrice = view.findViewById(R.id.itemOneRatetextView);
        }
    }

    public HomeAdapter(List<ItemMenu> item){
        this.itemlist = item;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_today_special, parent, false);

        return new MyViewHolder (itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemMenu item = itemlist.get(position);
        holder.itemName.setText(item.getItem_name());
        holder.itemPrice.setText(item.getItem_price());

    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

}
