
import java.util.Scanner;

/**
 * Ejercicio 01: Generar un algoritmo que permita calcular y presentar el area
 * de un triangulo. Los datos deben ser pedidos al usuario
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Deme base: ");
        base = tcl.nextDouble();
        System.out.print("Deme altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.print("Area: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme base: 4
Deme altura: 5
Area: 10.0BUILD SUCCESSFUL (total time: 6 seconds)
 */