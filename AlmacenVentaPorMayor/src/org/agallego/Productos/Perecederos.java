package org.agallego.Productos;

public class Perecederos extends Alimentos{
    private int fechaVencimineto;

    public Perecederos(String nombreProd, int precio, double peso, int calorias, int fechaVencimineto) {
        super(nombreProd, precio, peso, calorias);
        this.fechaVencimineto = fechaVencimineto;
    }

    public int getFechaVencimineto() {
        return fechaVencimineto;
    }
}
