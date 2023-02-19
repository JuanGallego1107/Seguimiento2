package org.agallego.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaEspaniol;
    private double notaSociales;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematicas, double notaEspaniol, double notaSociales) {
        this(nombre, apellido, edad,institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaEspaniol = notaEspaniol;
        this.notaSociales = notaSociales;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaEspaniol() {
        return notaEspaniol;
    }

    public void setNotaEspaniol(double notaEspaniol) {
        this.notaEspaniol = notaEspaniol;
    }

    public double getNotaSociales() {
        return notaSociales;
    }

    public void setNotaSociales(double notaSociales) {
        this.notaSociales = notaSociales;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar+ " soy un alumno y mi nombre es "+ getNombre();
    }

    public double calcularPromedio(){
        return (notaSociales+notaEspaniol+notaMatematicas)/3;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nInstitucion{" +
                "institucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaEspaniol=" + notaEspaniol +
                ", notaSociales=" + notaSociales+
                ", promedio="+ this.calcularPromedio();
    }
}
