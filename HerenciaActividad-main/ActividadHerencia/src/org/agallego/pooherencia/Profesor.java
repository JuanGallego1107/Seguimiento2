package org.agallego.pooherencia;

public class Profesor extends Persona{
    private String Asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
       this.Asignatura = asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor de "
                + getAsignatura()+" y mi nombre es "
                +getNombre();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAsignatura='" + Asignatura + '\'';
    }
}
