package com.pruebaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Iniciar_sesion extends AppCompatActivity {
    Button crearCuenta, iniciar_sesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        crearCuenta = findViewById(R.id.crear_cuenta);
        iniciar_sesion = findViewById(R.id.iniciar_sesion);

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Iniciar_sesion.this, Registrar_usuario.class));
            }
        });

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Iniciar_sesion.this, Menu_comida.class));
            }
        });
    }
}
