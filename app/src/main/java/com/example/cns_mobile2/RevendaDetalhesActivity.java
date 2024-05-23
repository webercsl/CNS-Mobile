package com.example.cns_mobile2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RevendaDetalhesActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revenda_detalhes);
        new Navbar(this);

        TextView tituloTextView = findViewById(R.id.tituloTextView);
        TextView enderecoTextView = findViewById(R.id.enderecoTextView);
        TextView cidadeTextView = findViewById(R.id.cidadeTextView);
        TextView telefoneTextView = findViewById(R.id.telefoneTextView);
        TextView whatsappTituloTextView = findViewById(R.id.whatsappTituloTextView);
        TextView whatsappNumeroTextView = findViewById(R.id.whatsappNumeroTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView siteTextView = findViewById(R.id.siteTextView);
        ImageView whatsappIconImageView = findViewById(R.id.whatsappIconImageView);
        ImageView facebookIconImageView = findViewById(R.id.facebookIconImageView);
        ImageView instagramIconImageView = findViewById(R.id.instagramIconImageView);
        Button conhecaVeiculosButton = findViewById(R.id.conhecaVeiculosButton);

        tituloTextView.setText("Nome da revenda escolhida");
        enderecoTextView.setText("Endereço");
        cidadeTextView.setText("Cidade");
        telefoneTextView.setText("Telefone");
        whatsappNumeroTextView.setText("Número do Whatsapp");
        emailTextView.setText("E-mail");
        siteTextView.setText("Site");

        facebookIconImageView.setOnClickListener(v -> {
            // Implementar o redirecionamento para a página do Facebook
        });

        instagramIconImageView.setOnClickListener(v -> {
            // Implementar o redirecionamento para a página do Instagram
        });

        conhecaVeiculosButton.setOnClickListener(v -> {
            // Implementar o código para ir para a Activity RevendaVeiculos
        });
    }
}
