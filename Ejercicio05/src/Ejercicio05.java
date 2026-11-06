import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU,
 * teclado, pantalla, ratón."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precioCpu;
        double precioTeclado;
        double precioPanta;
        double precioRaton;
        double total;
        
        System.out.println("Digite el valor del CPU: ");
        precioCpu = tcl.nextDouble();
        System.out.println("Digite el valor del Teclado: ");
        precioTeclado = tcl.nextDouble();
        System.out.println("Digite el valor de la Pantalla: ");
        precioPanta = tcl.nextDouble();
        System.out.println("Digite el valor del Raton:");
        precioRaton = tcl.nextDouble();
        
        total = precioCpu + precioTeclado + precioPanta + precioRaton;
        System.out.println("El valor total de la Computadora es: " + total);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Digite el valor del CPU: 
120
Digite el valor del Teclado: 
23,50
Digite el valor de la Pantalla: 
111,23
Digite el valor del Raton:
5,50
El valor total de la Computadora es: 260.23
BUILD SUCCESSFUL (total time: 25 seconds)
 */
