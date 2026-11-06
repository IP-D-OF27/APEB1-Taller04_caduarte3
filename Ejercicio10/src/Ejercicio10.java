import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B,
 * C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado,
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se pide
 * que haga un programa que calcule el área total.
 * 
 * Por cultura general, sabemos que el área de un rectángulo se calcula
 * multiplicando su base por su altura; el área de un triángulo rectángulo se
 * calcula multiplicando su base por su altura, y luego dividiendo el resultado
 * entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado
 * la medida de uno de sus lados.
 * 
 * La parte interesante de este problema es determinar el mínimo número de datos
 * que hay que preguntar. Polígono"
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado;
        double altura;
        double areaCuadrado;
        double areaTriangulo;
        double areaRectangulo;
        double areaTotal;
        
        System.out.println("Ingrese la medida del lado base del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.println("Ingrese la altura comun de (triangulos y"
                + " rectangulos)");
        altura = tcl.nextDouble();
        
        areaCuadrado = lado * lado;
        areaTriangulo = 3 * ((lado * altura) / 2.0);
        areaRectangulo = lado * altura;
        areaTotal = areaCuadrado + areaTriangulo + areaRectangulo;
        
        System.out.println("Area del cuadrado: " + areaCuadrado);
        System.out.println("Area de los tres triangulos: " + areaTriangulo);
        System.out.println("Area del rectangulo: " + areaRectangulo);
        System.out.println("El area total del poligono es: " + areaTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la medida del lado base del cuadrado: 
5,6
Ingrese la altura comun de (triangulos y rectangulos)
3,5
Area del cuadrado: 31.359999999999996
Area de los tres triangulos: 29.4
Area del rectangulo: 19.599999999999998
El area total del poligono es: 80.35999999999999
BUILD SUCCESSFUL (total time: 29 seconds)
 */