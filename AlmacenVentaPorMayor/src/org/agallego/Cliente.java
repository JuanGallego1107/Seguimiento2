package org.agallego;

public class Cliente extends Persona{
    private String tipoCliente;
    private String codigoCuenta;

    public Cliente(String name, String apellido,String id, String tipoCliente, String codigoCuenta) {
        super(name, apellido,id);
        this.tipoCliente = tipoCliente;
        this.codigoCuenta = codigoCuenta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }
}
