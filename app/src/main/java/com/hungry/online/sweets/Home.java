package com.hungry.online.sweets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hungry.online.sweets.ui.PostActivity;

public class Home extends AppCompatActivity {
    EditText age,name,num;
    Button sub;
    DatabaseReference reference;
    Information information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        name=findViewById(R.id.txtname);
        num=findViewById(R.id.txtnum);
        age=findViewById(R.id.txtage);
        sub=findViewById(R.id.btnsub);
        information=new Information();
        reference= FirebaseDatabase.getInstance().getReference().child("Information");
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int agea=Integer.parseInt(age.getText().toString().trim());
                Long ph=Long.parseLong(num.getText().toString().trim());

                information.setName(name.getText().toString().trim());
                information.setAge(agea);
                information.setPh(ph);

                reference.push().setValue(information);
                Toast.makeText(Home.this, "User Registration Successful", Toast.LENGTH_SHORT).show();
                Intent in=new Intent(Home.this,MainActivity.class);
                startActivity(in);


            }
        });


    }
}
