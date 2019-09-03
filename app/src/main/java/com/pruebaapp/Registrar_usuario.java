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
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;



public class Registrar_usuario extends AppCompatActivity implements View.OnClickListener {
    Button irInciarSesion;
    Button crear_cuenta;
    EditText et_nombre;
    EditText et_apellido;
    EditText et_usuario;

    EditText etcontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        irInciarSesion = findViewById(R.id.btn_ir_iniciarSesion);
        crear_cuenta = findViewById(R.id.registrarme);
        crear_cuenta.setOnClickListener(this);

        et_nombre = findViewById(R.id.et_nombre);
        et_apellido = findViewById(R.id.et_apellido);
        et_usuario = findViewById(R.id.et_usuario);
        etcontrasena = findViewById(R.id.et_contrasena);

    }

    @Override
    public void onClick(View view) {
        RequestQueue cola = Volley.newRequestQueue(this);

        String url = "http://192.168.1.3/registro/registrar.php?nombre="+et_nombre.getText().toString()+"&apellido="+et_apellido.getText().toString()+
                "&usuario="+et_usuario.getText().toString()+"&contrasena="+etcontrasena.getText().toString();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        cola.add(stringRequest);
        Toast toast = Toast.makeText(getApplicationContext(), "Usuario Añadido", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Iniciar_sesion.class);
        startActivity(intent);
        finish();
    }
}
