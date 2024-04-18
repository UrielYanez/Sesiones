package mx.utng.R1;

import java.util.Scanner;

public class Problema22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de obreros: ");
        int obreros = scanner.nextInt();

        for (int i = 1; i <= obreros; i++) {
            System.out.println("Ingrese las horas trabajadas por el obrero número " + i + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas <= 40) {
                int salarioTotal = horasTrabajadas * 20;
                System.out.println("Salario Total: " + salarioTotal);
            } else if (horasTrabajadas > 40) {
                int horasNormales = 40;
                int horasExtras = horasTrabajadas - horasNormales;
                int salarioTotal = (horasNormales * 20) + (horasExtras * 25);
                System.out.println("Salario Total: " + salarioTotal);
            }
        }

        scanner.close();
    }
}
