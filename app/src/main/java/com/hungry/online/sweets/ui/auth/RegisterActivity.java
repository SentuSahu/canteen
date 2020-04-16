package com.hungry.online.sweets.ui.auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hungry.online.sweets.Home;
import com.hungry.online.sweets.R;

public class RegisterActivity extends AppCompatActivity {
    private Button register_button;
    private EditText email;
    private EditText password;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register_button = findViewById(R.id.register);
        Log.d("debug", "RegisterActivity");
        auth = FirebaseAuth.getInstance();
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();
                Log.d("debug","RegisterActivity OnClick");
                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    Toast.makeText(RegisterActivity.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
                } else if(txt_password.length() < 6 ){
                    Toast.makeText(RegisterActivity.this, "Password is too short", Toast.LENGTH_SHORT).show();
                } else{
                    registerUser(txt_email,txt_password);
                    Log.d("debug", "registerUser method call successful");
                }
            }
        });
    }

    private void registerUser(String email, String password) {
        Log.d("debug", "on RegisterUser method");
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(RegisterActivity.this ,new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Log.d("debug", "on complete method successful");





                    Toast.makeText(RegisterActivity.this, "Almost Done", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(RegisterActivity.this, Home.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(RegisterActivity.this, "User Not Register", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
