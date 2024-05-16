package com.example.cns_mobile2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AnuncieActivity extends AppCompatActivity {

    private Button btnRevenda;
    private Button btnParticular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncie);

        btnRevenda = findViewById(R.id.btnRevenda);
        btnParticular = findViewById(R.id.btnParticular);

        btnRevenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnuncieActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        });

        btnParticular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnuncieActivity.this, CadastroParticularActivity.class);
                startActivity(intent);
            }
        });
    }
}
