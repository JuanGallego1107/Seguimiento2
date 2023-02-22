package org.agallego.Productos;

public class Limpieza extends Productos{
    private String componenentes;
    private double litrosGramos;

    public Limpieza(String nombreProd, int precio, String componenentes, double litrosGramos) {
        super(nombreProd, precio);
        this.componenentes = componenentes;
        this.litrosGramos = litrosGramos;
    }

    public String getComponenentes() {
        return componenentes;
    }

    public double getLitrosGramos() {
        return litrosGramos;
    }
}
