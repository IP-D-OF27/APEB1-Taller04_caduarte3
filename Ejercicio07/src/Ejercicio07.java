import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor a
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costokwHora;
        double kwConsumidos;
        int edadUsuario;
        double subtotal;
        double desc = 0.0;
        double pagoTotal;
        
        System.out.println("Escriba el costo de Kilovatio/hora: ");
        costokwHora = tcl.nextDouble();
        System.out.println("Escriba el numero de Kilovatios consumidos en el "
                + "mes: ");
        kwConsumidos = tcl.nextDouble();
        System.out.println("Escriba la edad del usuario: ");
        edadUsuario = tcl.nextInt();
        subtotal = costokwHora * kwConsumidos;
        if (edadUsuario > 65) {
            desc = subtotal * 0.10;
            pagoTotal = subtotal - desc;
            System.out.println("Si aplica al descuento de tercera edad");
        } else {
            pagoTotal = subtotal;
            System.out.println("No aplica al descuento");
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento aplicado: " + desc);
        System.out.println("El valor total a pagar de la planilla es: "
                + pagoTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 run:
Escriba el costo de Kilovatio/hora: 
0,16
Escriba el numero de Kilovatios consumidos en el mes: 
400
Escriba la edad del usuario: 
20
No aplica al descuento
Subtotal: 64.0
Descuento aplicado: 0.0
El valor total a pagar de la planilla es: 64.0
BUILD SUCCESSFUL (total time: 1 minute 8 seconds)
 */