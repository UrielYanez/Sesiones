package mx.utng.s08;

public class Fabrica {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Chevrolet", "Cheyenne", 2008, 65000);

        Automovil auto2 = new Automovil("Lamborghini", "Gran Turismo", 2020, 0);

        Automovil auto3 = new Automovil("Bentley", "Continental Gt", 2022, 0);

        System.out.println("Auto 1, hash: "+auto1.hashCode());
        System.out.println("Auto 2, hash: "+auto2.hashCode());
        System.out.println("Auto 3, hash: "+auto3.hashCode());

        Automovil auto4 = auto1;
        System.out.println("Auto 4; hash: "+auto4.hashCode());
    }
}
