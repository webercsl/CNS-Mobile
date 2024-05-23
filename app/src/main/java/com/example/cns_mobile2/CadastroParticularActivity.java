package com.example.cns_mobile2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroParticularActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastroparticular);
        new Navbar(this);
    }
}

