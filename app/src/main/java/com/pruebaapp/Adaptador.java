package com.pruebaapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adaptador extends ArrayAdapter<Pizzas> {

    private List<Pizzas> listaPizas;
    private Context contexto;
    private int resourceLayaout;

    public Adaptador(@NonNull Context context, int resource, List<Pizzas> objects) {
        super(context, resource, objects);
        this.listaPizas = objects;
        this.resourceLayaout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = LayoutInflater.from(contexto).inflate(R.layout.elemento_lista,null);

        Pizzas pizzas = listaPizas.get(position);

        TextView pizza = view.findViewById(R.id.tv_pizza);
        pizza.setText(pizzas.getPizza());
        TextView tamano = view.findViewById(R.id.tv_tamano);
        tamano.setText(pizzas.getTamano());
        TextView precio = view.findViewById(R.id.tv_precio);
        precio.setText(pizzas.getPrecio());

        return view;
    }
}
