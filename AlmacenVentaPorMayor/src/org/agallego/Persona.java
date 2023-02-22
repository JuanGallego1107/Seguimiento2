package org.agallego;

public class Persona {
    private String name;
    private String apellido;
    private String id;

    public Persona(String name, String apellido,String id) {
        this.name = name;
        this.apellido = apellido;
        this.id = id;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId(){
        return id;
    }
}
