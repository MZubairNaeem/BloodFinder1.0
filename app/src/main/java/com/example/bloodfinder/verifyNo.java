package com.example.bloodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class verifyNo extends AppCompatActivity {

    TextView userPhoneNo;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_no);

        Objects.requireNonNull(getSupportActionBar()).hide();

        userPhoneNo = findViewById(R.id.userPhoneNumber);
        number = getIntent().getExtras().getString("message");
        userPhoneNo.setText(number);
    }
}