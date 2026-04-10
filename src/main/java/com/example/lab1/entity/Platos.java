package com.example.lab1.entity;

public class Platos {
    public String nombre;
    public double precio;
    public Integer tiempoPrep;
    public String tipo;

    public Platos(String nombre, double precio, Integer tiempoPrep, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoPrep = tiempoPrep;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTiempoPrep(Integer tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
