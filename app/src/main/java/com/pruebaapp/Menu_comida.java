package com.pruebaapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Menu_comida extends AppCompatActivity {

    ListView listaPizzas;
    ArrayList<Pizzas> arrayPizzas;
    ArrayList<Pizzas> compraPizzas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_comida);

        arrayPizzas = new ArrayList<>();
        compraPizzas = new ArrayList<>();

        arrayPizzas.add(new Pizzas("al Ajo","Grande",330,1));
        arrayPizzas.add(new Pizzas("Alcaucil", "Grande", 380, 1));
        arrayPizzas.add(new Pizzas("Alcausil grati", "Grande", 380, 1));
        arrayPizzas.add(new Pizzas("Anana", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Anchoas", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Ave", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Azafran", "Grande", 450, 1));
        arrayPizzas.add(new Pizzas("Bacon", "Grande", 370, 1));
        arrayPizzas.add(new Pizzas("Calabresa", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Camarones", "Grande", 500, 1));
        arrayPizzas.add(new Pizzas("Champigñones", "Grande", 370, 1));
        arrayPizzas.add(new Pizzas("Cherry y albaca", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Choclo", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Criolla", "Grande", 320, 1));
        arrayPizzas.add(new Pizzas("Especial", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Fugazz con Jamo", "Grande", 345, 1));
        arrayPizzas.add(new Pizzas("Fugazza", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Guapa", "Grande", 160, 1));
        arrayPizzas.add(new Pizzas("Italiana", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Loca", "Grande", 320, 1));
        arrayPizzas.add(new Pizzas("MUZZA", "Grande", 310, 1));
        arrayPizzas.add(new Pizzas("Muzzarella", "Grande", 310, 1));
        arrayPizzas.add(new Pizzas("Napoleon", "Grande", 370, 1));
        arrayPizzas.add(new Pizzas("Napolita Oliva ", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Napolitana", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Nueces", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Palmitos", "Grande", 370, 1));
        arrayPizzas.add(new Pizzas("Panceta y ALbac", "Grande", 350, 1));
        arrayPizzas.add(new Pizzas("Panceta y Cirue", "Grande", 360, 1));
        arrayPizzas.add(new Pizzas("Pollo", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Pollo y curri  ", "Grande", 360, 1));
        arrayPizzas.add(new Pizzas("Provenzal", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("Provolone", "Grande", 340, 1));
        arrayPizzas.add(new Pizzas("queso de cabra ","Grande",340,1));

        listaPizzas = findViewById(R.id.lv_ListaPizzas);

        PizzasAdapter pizzasAdapter =new PizzasAdapter();

        listaPizzas.setAdapter(pizzasAdapter);

    }

    public class PizzasAdapter extends ArrayAdapter<Pizzas> {

        PizzasAdapter() {
            super(Menu_comida.this, R.layout.elemento_lista, arrayPizzas);

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.elemento_lista, parent, false);



            TextView pizza = view.findViewById(R.id.tv_pizza);
            TextView tamano = view.findViewById(R.id.tv_tamano);
            TextView precio = view.findViewById(R.id.tv_precio);


            Pizzas miPizza = arrayPizzas.get(position);

            pizza.setText(miPizza.getPizza());
            tamano.setText(miPizza.getTamano());
            precio.setText(Double.toString(miPizza.getPrecio()));

            return view;
        }
    }
}
