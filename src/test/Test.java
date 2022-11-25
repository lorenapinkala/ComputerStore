
package test;

import pc.*;


public class Test {
    public static void main(String[] args) {
        
        Monitor monitor1= new Monitor("eich pi",13);
        Teclado teclado1 = new Teclado("blue2", "eich pi");
        Raton raton1 = new Raton ("blue2", "eich pi");
        Computadora computadora1 = new Computadora("Computadora Lenuevo", monitor1, teclado1, raton1);
        
        Monitor monitor2= new Monitor("nogal",14);
        Teclado teclado2 = new Teclado("blue2", "nogal");
        Raton raton2 = new Raton ("blue2", "nogal");
        Computadora computadora2 = new Computadora("Computadora Lenuevo", monitor2, teclado2, raton2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}