import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar el
 * valor total a pagar mensual de servicios digitales de una persona.
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        int edadUsuario;
        double subtotal;
        double desc = 0.0;
        double pagoTotal;
        
        System.out.println("Ingrese el valor mensual de Netflix: ");
        netflix = tcl.nextDouble();
        System.out.println("Ingrese el valor mensual de Youtube: ");
        youtube = tcl.nextDouble();
        System.out.println("Ingrese el valor mensual de Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.println("Ingrese el valor mensual de Spotify: ");
        spotify = tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edadUsuario = tcl.nextInt();
        
        subtotal = netflix + youtube + dropbox + spotify;
        if (edadUsuario < 30) {
            desc = subtotal * 0.20;
            pagoTotal = subtotal - desc;
            System.out.println("Si aplica al 20% de descuento");
        } else {
            pagoTotal = subtotal;
            System.out.println("No aplica al descuento");
        }
        
        System.out.println("Subtotal mensual: " + subtotal);
        System.out.println("Descuento aplicado: " + desc);
        System.out.println("El valor mensual total a pagar es: " + pagoTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el valor mensual de Netflix: 
14,25
Ingrese el valor mensual de Youtube: 
12,25
Ingrese el valor mensual de Dropbox: 
4,50
Ingrese el valor mensual de Spotify: 
3,99
Ingrese la edad del usuario: 
20
Si aplica al 20% de descuento
Subtotal mensual: 34.99
Descuento aplicado: 6.998000000000001
El valor mensual total a pagar es: 27.992
BUILD SUCCESSFUL (total time: 27 seconds)
 */