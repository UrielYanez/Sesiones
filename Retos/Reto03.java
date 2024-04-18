import java.util.Scanner;

public class Reto03 {
    public static void main(String[] args) {
        String mensaje = " ";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Teclea tu calificacion de P.O.O.");
            int nota = scanner.nextInt();

            if (nota == 10) {
                mensaje = "Excelente";
            } else if (nota == 9 || nota == 8) {
                mensaje = "Muy Bien";
            } else if (nota == 7) {
                mensaje = "Bien Hecho";
            } else if (nota == 6) {
                mensaje = "Reprobaste";
            } else if (nota == 5) {
                mensaje = "Mejor Vuelve a Cursar";
            } else {
                mensaje = "Nota No Válida";
            }
        }

        System.out.println(mensaje);
    }
}
    