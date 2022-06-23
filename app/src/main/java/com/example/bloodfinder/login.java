package com.example.bloodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class login extends AppCompatActivity implements View.OnClickListener{


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.B_signIn:
                startActivity(new Intent(this , registerNo.class));
                break;

            case R.id.B_register:
                startActivity(new Intent(this , verifyNo.class));
                break;


        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Button b_signIn =  findViewById(R.id.B_signIn);
        b_signIn.setOnClickListener(this);

        Button b_register = findViewById(R.id.B_register);
        b_register.setOnClickListener(this);



    }
}