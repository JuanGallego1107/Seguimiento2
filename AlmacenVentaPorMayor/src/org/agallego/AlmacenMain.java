package org.agallego;

import org.agallego.Productos.*;

public class AlmacenMain {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Cliente cliente = new Cliente("Juan", "Gallego", "10954374", "Preferencial", "43534");
        Vendedor vendedor = new Vendedor("Camila", "Cifuentes", "12383275", 1200000, 23);

        Productos productos = new Productos();
        Perecederos perecederos = new Perecederos("Galletas Saltin", 4500, 4.6, 2300, 2004);
        noPerecederos noperecederos = new noPerecederos("Atun",2300,7.8,1010,"lata");
        Limpieza limpieza = new Limpieza("Jabon Salvo",3100,"bicarbonato",1.5);

        imprimir(cliente);
        imprimir(vendedor);
        imprimirProductos(perecederos);
        imprimirProductos(noperecederos);
        imprimirProductos(limpieza);
    }
    public static void imprimir(Persona persona){
        System.out.println(persona.getName()+" "+ persona.getApellido()+" Id: "+ persona.getId());
        if(persona instanceof Cliente){
            System.out.println("Usted es un cliente: "+((Cliente)persona).getTipoCliente());
            System.out.println("Su codigo es: "+((Cliente)persona).getCodigoCuenta());
        }
        if(persona instanceof Vendedor){
            System.out.println("Su salario actual es: "+ ((Vendedor)persona).getSalario());
            System.out.println("Este mes vendío: "+((Vendedor)persona).getNumeroVentas());
        }
        System.out.println("==============================");
    }

    public static void imprimirProductos(Productos productos){
        System.out.println(productos.getNombreProd()+" $"+productos.getPrecio());
        if(productos instanceof Alimentos){
            System.out.println("Peso (gr): "+((Alimentos)productos).getPeso());
            System.out.println("Calorias: "+((Alimentos)productos).getCalorias());
            if(productos instanceof Perecederos){
                System.out.println("Vence: "+((Perecederos)productos).getFechaVencimineto());
            }else if(productos instanceof noPerecederos){
                System.out.println("Empaque: "+((noPerecederos)productos).getTipoEmpaquetado());
            }
        }
        if(productos instanceof Limpieza){
            System.out.println("Componente: "+((Limpieza)productos).getComponenentes());
            System.out.println("Contenido neto (Lt/gr): "+((Limpieza)productos).getLitrosGramos());
        }
        System.out.println("=================================");
    }
}
