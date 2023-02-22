package org.agallego;

public class Vendedor extends Persona {
    private int salario;
    private int numeroVentas;

    public Vendedor(String name, String apellido, String id, int salario, int numeroVentas) {
        super(name, apellido, id);
        this.salario = salario;
        this.numeroVentas = numeroVentas;
    }

    public int getSalario() {
        return salario;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }
}
