package mx.utng.s06;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("Ejemplo del ciclo for");
        //Inprimimos los números del 1 a 10
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        //Números de 2 en 2 hasta 100
        for(int i = 2; i<=100; i+=2){
            System.out.println(i);
        }

        //tabla del 5
        for(int i =1; i<=10; i++){
            System.out.printf("5x%d=%d%n", i, i*50);
        }

        //Tabla del número que diga el ususario
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea un número de la tabla que deseas: ");
        int n = s.nextInt();
        s.close();
        for(int i =1; i <=10; i++){
        System.out.printf("%dx%d=%d%n", n, i ,n*i);
        }

        //Miuestra los valores del arreglo dado
        String[] frutas = {"Mango", "Pera", "Manzana", "Melón", "Plátano"};
        for(int i = 0; i <frutas.length; i++){
            System.out.println(frutas[i]);
        }

        

    }
}
