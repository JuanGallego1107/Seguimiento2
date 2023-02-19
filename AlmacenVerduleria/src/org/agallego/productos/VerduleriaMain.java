package org.agallego.productos;

public class VerduleriaMain {
    public static void main(String[] args) {
        Producto producto = new Producto();

        Lacteo lacteo = new Lacteo("Leche Alqueria",2000,45,1250);
        Fruta fruta = new Fruta("Manzana",800,4.5,"Roja");
        Limpieza limpieza = new Limpieza("Jabon Salvo",3200,"sodio",2.5);
        NoPerecible noPerecible = new NoPerecible("Atun",3000,120,400);

        imprimir(lacteo);
        imprimir(fruta);
        imprimir(limpieza);
        imprimir(noPerecible);

    }

    public static void imprimir(Producto producto){
        System.out.println(producto.getNombre()+
                " $"+ producto.getPrecio());
        if(producto instanceof Lacteo){
            System.out.println("Cantidad (gr): "+ ((Lacteo)producto).getCantidad());
            System.out.println("Proteinas (gr): "+ ((Lacteo)producto).getProteinas());
        }else if(producto instanceof Fruta){
            System.out.println("Peso (gr): "+((Fruta)producto).getPeso());
            System.out.println("Color: "+((Fruta)producto).getColor());
        } else if (producto instanceof Limpieza) {
            System.out.println("Componentes: "+((Limpieza)producto).getComponentes());
            System.out.println("Litros: "+((Limpieza)producto).getLitros());
        } else if (producto instanceof NoPerecible) {
            System.out.println("Calorias (kCal): "+((NoPerecible)producto).getCalorias());
            System.out.println("Contenido neto (gr): "+((NoPerecible)producto).getContenido());
        }
        System.out.println("====================================");
    }
}
