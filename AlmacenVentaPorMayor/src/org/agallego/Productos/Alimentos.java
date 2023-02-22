package org.agallego.Productos;

public class Alimentos extends Productos{
    private double peso;
    private int calorias;

    public Alimentos(String nombreProd, int precio, double peso, int calorias) {
        super(nombreProd, precio);
        this.peso = peso;
        this.calorias = calorias;
    }

    public Alimentos(){

    }

    public double getPeso() {
        return peso;
    }

    public int getCalorias() {
        return calorias;
    }
}
