package com.pruebaapp;

public class Pizzas {

    private String pizza;
    private String tamano;
    private int precio;

    public Pizzas(String pizza, String tamano, int precio) {
        this.pizza = pizza;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
