package com.pruebaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar_usuario extends AppCompatActivity {

    Button irInciarSesion, crear_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        irInciarSesion = findViewById(R.id.btn_ir_iniciarSesion);
        crear_cuenta = findViewById(R.id.registrarme);

        irInciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrar_usuario.this, Iniciar_sesion.class));
                finish();
            }
        });

        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui codigo
            }
        });
    }
}
