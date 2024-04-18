package mx.utng.s06.Reto01;

import java.util.Scanner;

public class NúmerosPares {

    public static void main(String[] args) {
        // Utilizando el módulo poner todos los números pares
        // que hay en un rango dado por el usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor mínimo del rango: ");
        int minimo = scanner.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        scanner.close();

        System.out.println("Los números pares en el rango :" + minimo + " al  " + maximo + " son: ");
        for (int i = minimo; i <= maximo; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
