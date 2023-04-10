package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.reflect.Constructor;

public class Producto {
    // Atributos
    private String nombre;
    @JsonIgnore
    private int stock;
    private float precio;

    // Constructor
    public Producto() {
    }

    public Producto(String nombre, int stock, float precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
