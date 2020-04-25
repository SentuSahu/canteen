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

public class PostActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseDatabase database;
    String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        final EditText itemName = findViewById(R.id.item_name);
        final EditText itemPrice = findViewById(R.id.item_price);
        Button addItems = findViewById(R.id.add);

        auth = FirebaseAuth.getInstance();

        FirebaseUser user = auth.getCurrentUser();
        uid = user.getUid();

        database = FirebaseDatabase.getInstance();
        final DatabaseReference db_reference = database.getReference("posts");
        addItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Query itemname = database.getReference("item").child(uid);
                itemname.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()){
//                            db_reference.child(uid).child("itemName")
//                                    .setValue(dataSnapshot.getValue(ItemMenu.class).getItem_name());
                            db_reference.child(uid).child("ItemName").setValue(itemName.getText().toString());
                            db_reference.child(uid).child("ItemPrice").setValue(itemPrice.getText().toString());

                            Toast.makeText(PostActivity.this, "Your post has been created successfully",
                                    Toast.LENGTH_LONG).show();
                            Log.d("debug","success");

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Log.d("debug", databaseError.getMessage());

                    }
                });
            }
        });


    }
}
