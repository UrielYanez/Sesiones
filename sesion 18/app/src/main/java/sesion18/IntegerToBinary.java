package sesion18;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println("Ingresa un número");
        int miNumero;
        String binario = Integer.toHexString(miNumero);
        System.out.printf("El número %d es en binario %s", miNumero, binario);
    }
}
