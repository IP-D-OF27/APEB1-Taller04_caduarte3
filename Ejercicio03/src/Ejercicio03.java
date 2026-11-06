import java.util.Scanner;
/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 2 y 6");
        int numero = tcl.nextInt();
        
        if (numero >= 2 && numero <= 6){
            System.out.println("Tabla de multiplicar del: " + numero);
            System.out.println(numero + " x 1 = " + (numero * 1));
            System.out.println(numero + " x 2 = " + (numero * 2));
            System.out.println(numero + " x 3 = " + (numero * 3));
            System.out.println(numero + " x 4 = " + (numero * 4));
            System.out.println(numero + " x 5 = " + (numero * 5));
            System.out.println(numero + " x 6 = " + (numero * 6));
            System.out.println(numero + " x 7 = " + (numero * 7));
            System.out.println(numero + " x 8 = " + (numero * 8));
            System.out.println(numero + " x 9 = " + (numero * 9));
            System.out.println(numero + " x 10 = " + (numero * 10));
            System.out.println(numero + " x 11= " + (numero * 11));
            System.out.println(numero + " x 12 = " + (numero * 12));
        } else {
            System.out.println("El numero debe ser entre 2 y 6");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero entre 2 y 6
5
Tabla de multiplicar del: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
5 x 11= 55
5 x 12 = 60
BUILD SUCCESSFUL (total time: 2 seconds)
 */