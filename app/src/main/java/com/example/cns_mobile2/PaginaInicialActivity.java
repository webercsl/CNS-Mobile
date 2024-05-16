package com.example.cns_mobile2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class PaginaInicialActivity extends AppCompatActivity {

    private TextView statusTextView;
    private Timer timer;
    private int timerCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);

        ProgressBar spinner = findViewById(R.id.spinner);
        statusTextView = findViewById(R.id.statusTextView);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(PaginaInicialActivity.this, BuscaActivity.class));
            finish();
        }, 3000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                switch (timerCounter % 3) {
                    case 0:
                        runOnUiThread(() -> statusTextView.setText("Aquecendo Motores"));
                        break;
                    case 1:
                        runOnUiThread(() -> statusTextView.setText("Enchendo o tanque"));
                        break;
                    case 2:
                        runOnUiThread(() -> statusTextView.setText("Calibrando Pneus"));
                        break;
                }
                timerCounter++;
            }
        }, 0, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
}
