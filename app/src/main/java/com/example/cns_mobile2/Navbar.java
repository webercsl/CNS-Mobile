// NavbarActivity.java
package com.example.cns_mobile2;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class Navbar {

    private Activity activity;

    public Navbar(Activity activity) {
        this.activity = activity;
        setupNavbar();
    }

    private void setupNavbar() {
        try {
            androidx.appcompat.widget.AppCompatButton btnBusca = activity.findViewById(R.id.busca_button);
            androidx.appcompat.widget.AppCompatButton btnRevendas = activity.findViewById(R.id.revendas_button);
            androidx.appcompat.widget.AppCompatButton btnAnuncie = activity.findViewById(R.id.anuncie_button);
            androidx.appcompat.widget.AppCompatButton btnContato = activity.findViewById(R.id.contato_button);

            btnBusca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.startActivity(new Intent(activity, BuscaActivity.class));
                }
            });

            btnRevendas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.startActivity(new Intent(activity, RevendasActivity.class));
                }
            });

            btnAnuncie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.startActivity(new Intent(activity, AnuncieActivity.class));
                }
            });

            btnContato.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.startActivity(new Intent(activity, ContatoActivity.class));
                }
            });


        } catch (Exception e) {
            Log.e("NavbarActivity", "Error setting up navbar", e);
        }
    }
}
