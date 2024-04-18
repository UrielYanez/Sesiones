package mx.utng.s07;

import java.util.Scanner;
public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leerOpcion(){
        System.out.println("Opción: ");
        return scanner.nextByte();
    }
}
