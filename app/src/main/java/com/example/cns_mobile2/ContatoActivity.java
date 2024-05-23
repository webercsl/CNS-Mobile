package com.example.cns_mobile2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ContatoActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextCidade;
    private EditText editTextEmail;
    private EditText editTextCelular;
    private EditText editTextMensagem;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
        new Navbar(this);

        editTextNome = findViewById(R.id.editTextNome);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextCelular = findViewById(R.id.editTextCelular);
        editTextMensagem = findViewById(R.id.editTextMensagem);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String cidade = editTextCidade.getText().toString();
                String email = editTextEmail.getText().toString();
                String celular = editTextCelular.getText().toString();
                String mensagem = editTextMensagem.getText().toString();

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "weber1.caxias@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contato via App");
                emailIntent.putExtra(Intent.EXTRA_TEXT,
                        "Nome: " + nome + "\n" +
                                "Cidade: " + cidade + "\n" +
                                "Email: " + email + "\n" +
                                "Celular: " + celular + "\n" +
                                "Mensagem: " + mensagem);

                if (emailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
                }
            }
        });
    }
}

