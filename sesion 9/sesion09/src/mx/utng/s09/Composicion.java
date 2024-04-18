package mx.utng.s09;

public class Composicion {
    public static void main(String[] args) {
        Llanta llanta1 = new Llanta(205, 16, 35);
        Llanta llanta2 = new Llanta(205, 16, 35);
        Llanta llanta3 = new Llanta(205, 16, 35);
        Llanta llanta4 = new Llanta(205, 16, 35);

        Combustible combustible = new Combustible();
        combustible.setLitrosActuales((short)0);
        combustible.setLitrosMaximos((short)40);

        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Chevy Pickup", 2005);

        vehiculo.colocarLlantas(llanta1, llanta2, llanta3, llanta4);

        vehiculo.setCombustible(combustible);

        vehiculo.llenarTanque();
        
        for (int i = 0; i < 5; i++) {
            vehiculo.avanzar();            
        }
    }

}
