package com.pruebaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonRequest;
import org.json.JSONObject;


public class Registrar_usuario extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {
    RequestQueue requestQueue;
    JsonRequest jsonRequest;
    Button irInciarSesion, crear_cuenta;
    EditText et_nombre, et_apellido, et_usuario, etcontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        irInciarSesion = findViewById(R.id.btn_ir_iniciarSesion);
        crear_cuenta = findViewById(R.id.registrarme);
        et_nombre = findViewById(R.id.et_nombre);
        et_apellido = findViewById(R.id.et_apellido);
        et_usuario = findViewById(R.id.et_usuario);
        etcontrasena = findViewById(R.id.et_contrasena);

        irInciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registrar_usuario.this, Iniciar_sesion.class));
                finish();
            }
        });

        crear_cuenta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                registrarUSuario();
            }
        });
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this, "No se pudo registrar"+error.toString()+et_nombre.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResponse(JSONObject response) {
        Toast.makeText(this , "Se registro el usuario"+et_nombre.getText().toString(), Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Registrar_usuario.this, Iniciar_sesion.class));
    }
    //revisar vincular con la base de datos !!
    public void registrarUSuario(){



    }
}
