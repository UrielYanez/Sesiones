package mx.utng.s09;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    public void usar(){
        litrosActuales--;
        System.out.printf("Quedan %d litros.%n", litrosActuales);
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }
    
}
