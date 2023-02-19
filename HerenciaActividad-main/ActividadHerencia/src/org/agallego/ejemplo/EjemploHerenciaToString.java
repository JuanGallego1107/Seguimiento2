package org.agallego.ejemplo;

import org.agallego.pooherencia.Alumno;
import org.agallego.pooherencia.AlumnoInternacional;
import org.agallego.pooherencia.Persona;
import org.agallego.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        Persona persona = new Persona();

        System.out.println("========= Creando instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("John", "Gallego", 15, "Instituto Nacional");
        alumno.setNotaEspaniol(5.5);
        alumno.setNotaSociales(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("ggallego@gmail.com");

        System.out.println("==========Creando la instancia de la clase Alumno Internacional=========");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Hoggins");
        alumnoInternacional.setPais("Suiza");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaEspaniol(9.5);
        alumnoInternacional.setNotaSociales(7.8);
        alumnoInternacional.setNotaMatematicas(6.9);
        alumnoInternacional.setEmail("peeter12@gmail.com");

        System.out.println("==========Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor("Juan", "Ruiz", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("ruiz5687@gmail.com");


        /*System.out.println(alumno.getNombre() + " " + alumno.getApellido());

        System.out.println(alumnoInternacional.getNombre()
                + " " + alumnoInternacional.getApellido()
                + " " + alumnoInternacional.getInstitucion()
                + " " + alumnoInternacional.getPais());

        System.out.println("Profesor de " + profesor.getAsignatura() + " : " + profesor.getNombre() + " " + profesor.getApellido());

         */
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);
    }
    public static void imprimir(Persona persona){
        System.out.println("============================");
        System.out.println(persona);
    }
}
