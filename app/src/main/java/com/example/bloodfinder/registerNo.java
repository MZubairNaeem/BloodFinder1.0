package com.example.bloodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class registerNo extends AppCompatActivity implements View.OnClickListener {

    EditText phoneBox;
    Button continueBtn;
    String number;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.continueButton) {
            continueButton();
        }
    }

    private void continueButton() {
        String phoneNo = phoneBox.getText().toString().trim();
        if (phoneNo.isEmpty()){
            phoneBox.setError("Enter Phone Number");
            phoneBox.requestFocus();
            return;
        }
        Intent intent = new Intent(this, verifyNo.class);
        number = phoneBox.getText().toString();
        intent.putExtra("message",number);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_no);

        Objects.requireNonNull(getSupportActionBar()).hide();
        phoneBox = findViewById(R.id.phoneBox);
        continueBtn = findViewById(R.id.continueButton);
        continueBtn.setOnClickListener(this);
    }
}