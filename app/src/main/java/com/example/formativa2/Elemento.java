package com.example.formativa2;

public class Elemento {
    private String nombre;
    private String categoria;
    private String info;
    private int foto;

    public Elemento(String nombre, String categoria, String info, int foto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.info = info;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getInfo() {
        return info;
    }

    public int getFoto() {
        return foto;
    }
}