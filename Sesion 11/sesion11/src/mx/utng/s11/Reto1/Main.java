package mx.utng.s11.Reto1;

import java.time.LocalDate;


    public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("Pedrito", (byte) 26, LocalDate.of(2000, 5, 29), 500, "Phyton");
        System.out.println(programador.toString());
    }
}

