import java.util.Scanner;

public class Reto01 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola  "+ nombre);
        scanner.close();
        
    }
}
