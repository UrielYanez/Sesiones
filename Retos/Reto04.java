import java.util.Scanner;

public class Reto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion de P.O.O.");
        int nota = scanner.nextInt();
        scanner.close();

        String mensaje =" ";
        switch (nota) {
            case 10:
                mensaje = "Excelente";
                break;
            case 9:
            case 8:
                mensaje = "Muy Bien";
                break;
            case 7:
                mensaje = "Bien Hecho";
                break;
            case 6:
                mensaje = "Reprobaste";
                break;
            case 5:
                mensaje = "Mejor vuelve a cursar";
                break;

            default:
                mensaje = "Nota no valida";
                break;
        }

        System.out.println(mensaje);



    }
    
}