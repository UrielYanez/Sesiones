package mx.utng.s12;


public class Polimorfismo {
    public static void main(String[] args) {
        //Crear un objeto v de la clase venado
        Venado v = new Venado();

        Animal a = v;

        Herviboro h = v;

        Object o = v;

        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+ (a instanceof Venado));
        System.out.println("Herviboro: "+ (h instanceof Venado));
        System.out.println("Objeto: "+ (o instanceof Venado));
        //System.out.println("Scanner: "+(v instanceof Scanner));
        //No se puede hacer asi

        v.comer();
        Humano humano = new Humano();
        humano.comer();
    }
}
