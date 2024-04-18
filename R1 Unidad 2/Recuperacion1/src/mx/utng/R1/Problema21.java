package mx.utng.R1;

import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();


        double sumaCalificaciones = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Calificación de la asignatura número " + i + ": ");
            double calificacion = scanner.nextDouble();

            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Ingrese una calificación válida (1-10)");
                i--;
                continue;
            }

            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / 8;

        if (promedio <= 10 && promedio > 8.6) {
            System.out.println("Excelente");
        } else if (promedio <= 8.5 && promedio > 7.6) {
            System.out.println("Bien Hecho");
        } else{
            System.out.println("No pasó");
        }
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println(" Promedio: " + promedio);

        scanner.close();
    }
}