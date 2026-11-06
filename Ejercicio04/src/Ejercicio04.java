import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMin;
        double minConsumidos;
        double totalPagar;
        
        System.out.println("Ingrese el costo por minuto: ");
        costoMin = tcl.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos: ");
        minConsumidos = tcl.nextDouble();
        totalPagar = costoMin * minConsumidos;
        System.out.println("El valor a pagar de planilla es: " + totalPagar);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el costo por minuto: 
0,3
Ingrese el numero de minutos consumidos: 
30
El valor a pagar de planilla es: 9.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */
