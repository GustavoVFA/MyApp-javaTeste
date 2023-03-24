package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    Button btnAbrirLogin;
    //Declarando o objeto Botão
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        //Apresentando o XML para o JAVA
        btnAbrirLogin = findViewById(R.id.BtnAbrirLogin);

        //Criar a ação de cliqeu no botão
        btnAbrirLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                Toast.makeText(getApplicationContext(), "Cliquei", Toast.LENGTH_SHORT).show();
            }
        });
    }
}