package org.agallego.Productos;

public class noPerecederos extends Alimentos{
    private String tipoEmpaquetado;

    public noPerecederos(String nombreProd, int precio, double peso, int calorias, String tipoEmpaquetado) {
        super(nombreProd, precio, peso, calorias);
        this.tipoEmpaquetado = tipoEmpaquetado;
    }

    public String getTipoEmpaquetado() {
        return tipoEmpaquetado;
    }
}
