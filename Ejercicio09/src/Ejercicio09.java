import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia. La regla institucional establece que:
 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la
 * nota final redondeada a un decimal."
 * @author Alfredo Duarte
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaluacionCont;
        double examenFinal;
        double porcentajeAsis;
        double notafinal;
        double asistMinima = 70.0;
        double notaexaMinima = 7.0;
        
        System.out.println("Ingrese la nota de evaluacion continua: ");
        evaluacionCont = tcl.nextDouble();
        System.out.println("Ingrese la nota del examen final: ");
        examenFinal = tcl.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencia: ");
        porcentajeAsis = tcl.nextDouble();
        
        if (porcentajeAsis < asistMinima) {
            System.out.println("Estado: Reprobado");
            System.out.println("Motivo: No cumple con el porcentaje minimo de"
                    + " asistencia");
        } else {
            if (examenFinal < notaexaMinima) {
                System.out.println("Estado: Reprobado");
                System.out.println("Motivo: La nota del examen final es menor al"
                        + "minimo requerido");
            } else {
                notafinal = (evaluacionCont * 0.40) + (examenFinal * 0.60);
                notafinal = Math.round(notafinal * 10.0) / 10.0;
                if (notafinal >= 7.0) {
                    System.out.println("Estado: Aprobado");
                } else if (notafinal >= 4.0 && notafinal < 7.0){
                    System.out.println("Estado: Supletorio");
                } else {
                    System.out.println("Estado: Reprobado");
                }
                
                System.out.println("Nota final: " + notafinal);
            }
        }
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la nota de evaluacion continua: 
8,5
Ingrese la nota del examen final: 
4,5
Ingrese el porcentaje de asistencia: 
72
Estado: Reprobado
Motivo: La nota del examen final es menor alminimo requerido
BUILD SUCCESSFUL (total time: 14 seconds)
 */