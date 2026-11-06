import java.util.Scanner;
/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del
 * préstamo y el interés mensual a cobrar."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double montoPrest;
        double porcentajeIntMes;
        double cuotaMes;
        double interesMes;
        double pagoTotalMes;
        
        System.out.println("Ingrese el monto del prestamo solicitado: ");
        montoPrest = tcl.nextDouble();
        System.out.println("Ingrese el porcentaje mensual: ");
        porcentajeIntMes = tcl.nextDouble();
        cuotaMes = montoPrest / 12;
        interesMes = montoPrest * (porcentajeIntMes / 100);
        pagoTotalMes = cuotaMes + interesMes;
        System.out.println("Cuota mensual de capital sin interes: " + cuotaMes);
        System.out.println("Interes generado por mes: " + interesMes);
        System.out.println("El pago total a pagar cada mes es: " + pagoTotalMes);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese el monto del prestamo solicitado: 
10000
Ingrese el porcentaje mensual: 
4,5
Cuota mensual de capital sin interes: 833.3333333333334
Interes generado por mes: 450.0
El pago total a pagar cada mes es: 1283.3333333333335
BUILD SUCCESSFUL (total time: 9 seconds)
 */