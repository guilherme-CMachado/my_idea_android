package com.example.my_idea_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {
    
    String TAG = "My_Idea_App";
    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d(TAG, "onCreate: Splash_Screen_Carregada");
        trocarTela();
    }

    private void trocarTela(){

        Log.d(TAG, "trocarTela: trocando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent trocarTela = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(trocarTela);
                finish();
            }
        },tempoDeEspera);


    }
}