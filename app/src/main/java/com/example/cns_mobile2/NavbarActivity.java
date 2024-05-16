package com.example.cns_mobile2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NavbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        Button buscaButton = findViewById(R.id.busca_button);
        Button revendasButton = findViewById(R.id.revendas_button);
        Button anuncieButton = findViewById(R.id.anuncie_button);
        Button contatoButton = findViewById(R.id.contato_button);

    buscaButton.setOnClickListener(v -> startActivity(new Intent(NavbarActivity.this, BuscaActivity.class)));
    revendasButton.setOnClickListener(v -> startActivity(new Intent(NavbarActivity.this, RevendasActivity.class)));
    anuncieButton.setOnClickListener(v -> startActivity(new Intent(NavbarActivity.this, AnuncieActivity.class)));
    contatoButton.setOnClickListener(v -> startActivity(new Intent(NavbarActivity.this, ContatoActivity.class)));
    }
}
