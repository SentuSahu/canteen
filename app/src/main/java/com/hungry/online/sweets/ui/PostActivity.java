package com.hungry.online.sweets.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.hungry.online.sweets.R;
import com.hungry.online.sweets.model.ItemMenu;

public class PostActivity extends AppCompatActivity implements View.OnClickListener {

    EditText itemName, itemPrice;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference("items");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        itemName = findViewById(R.id.item_name);
        itemPrice = findViewById(R.id.item_price);
        Button addItems = findViewById(R.id.add);

        addItems.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String name = itemName.getText().toString();
        String price = itemPrice.getText().toString();
        addItems(name,price);
    }

    private void addItems(String name, String price) {
        ItemMenu itemMenu = new ItemMenu(name, price);
        String userId = "";
        myRef.child("Sweets").child("items").push().setValue(itemMenu);
        Toast.makeText(this, "added Successfully", Toast.LENGTH_SHORT).show();
    }
}
