package com.example.cns_mobile2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RevendaVeiculosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revenda_veiculos);
        new Navbar(this);

        Spinner spinnerOrdenarPor = findViewById(R.id.spinnerOrdenarPor);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.opcoes_ordenar_por, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOrdenarPor.setAdapter(adapter);
    }
}
