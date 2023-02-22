package org.agallego.Productos;

public class Productos {
    private String nombreProd;
    private int precio;

    public Productos(String nombreProd, int precio) {
        this.nombreProd = nombreProd;
        this.precio = precio;
    }

    public Productos() {
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public int getPrecio() {
        return precio;
    }
}
