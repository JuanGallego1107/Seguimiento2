package org.agallego.ejemplo;

import org.agallego.pooherencia.Alumno;
import org.agallego.pooherencia.AlumnoInternacional;
import org.agallego.pooherencia.Persona;
import org.agallego.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("========= Creando instancia de la clase Alumno =======");
        Alumno alumno = new Alumno();
        alumno.setNombre("John");
        alumno.setApellido("Gallego");
        alumno.setNotaEspaniol(5.5);
        alumno.setNotaSociales(6.3);
        alumno.setNotaMatematicas(4.9);

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

        System.out.println("==========Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Ruiz");
        profesor.setAsignatura("Matematicas");


        System.out.println(alumno.getNombre()+" "+ alumno.getApellido());

        System.out.println(alumnoInternacional.getNombre()
                +" "+ alumnoInternacional.getApellido()
                +" "+ alumnoInternacional.getInstitucion()
                +" "+alumnoInternacional.getPais());

        System.out.println("Profesor de "+profesor.getAsignatura()+" : "+profesor.getNombre()+" "+ profesor.getApellido());

        //Class clase = alumnoInternacional.getClass();
        // while(clase.getSuperclass() != null){
        //     String hija = clase.getName();
        //     String padre = clase.getSuperclass().getName();
        //     System.out.println(hija+ " es una clase hija de la clase padre"+ padre);
        //     clase = clase.getSuperclass();
        // }
    }
}
