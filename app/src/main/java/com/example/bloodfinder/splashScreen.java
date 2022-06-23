package com.example.bloodfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread thread = new Thread(() -> {
            try {

                Thread.sleep(1000);

            }
            catch (Exception exception){
                exception.printStackTrace();
            }
            finally {
                Intent intent = new Intent(splashScreen.this, login.class);
                startActivity(intent);
                finish();
            }
        });thread.start();
    }
}
