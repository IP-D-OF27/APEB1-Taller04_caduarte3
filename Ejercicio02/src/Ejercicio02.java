
import java.util.Scanner;

/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los
 * hijos del padre de familia
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        System.out.print("Deme tres gastos: ");
        gastoHijo1 = tcl.nextInt();
        gastoHijo2 = tcl.nextInt();
        gastoHijo3 = tcl.nextInt();
        totalGastos = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("Total de gastos: " + totalGastos);
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme tres gastos: 33 44 55
Total de gastos: 132
BUILD SUCCESSFUL (total time: 5 seconds)
 */