package com.pruebaapp;

import java.io.Serializable;

public class Pizzas implements Serializable {

    private String pizza;
    private String tamano;
    private double precio;
    private int cantidad;

    public Pizzas(String pizza, String tamano, double precio, int cantidad) {
        this.pizza = pizza;
        this.tamano = tamano;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
