package org.agallego.productos;

public class VerduleriaMain {
    public static void main(String[] args) {
        Producto[] productos = new Producto[7];


        productos[0] = new Lacteo("Leche Alqueria", 2000, 45, 1250);
        productos[1] = new Fruta("Manzana", 800, 4.5, "Roja");
        productos[2] = new Limpieza("Jabon Salvo", 3200, "sodio", 2.5);
        productos[3] = new NoPerecible("Atun", 3000, 120, 400);
        productos[4] = new Lacteo("Queso doblecrema", 3600, 23, 1350);
        productos[5] = new Fruta("Manzana", 900, 3.5, "Verde");
        productos[6] = new Limpieza("Jabon Rey", 1800, "Aceite", 250);

        for (Producto producto : productos) {
            System.out.println(producto.getNombre() +
                    " $" + producto.getPrecio());
            if (producto instanceof Lacteo) {
                System.out.println("Cantidad (gr): " + ((Lacteo) producto).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) producto).getProteinas());
            } else if (producto instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) producto).getPeso());
                System.out.println("Color: " + ((Fruta) producto).getColor());
            } else if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
            } else if (producto instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) producto).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) producto).getContenido());
            }
            System.out.println("====================================");
        }

    }
}

