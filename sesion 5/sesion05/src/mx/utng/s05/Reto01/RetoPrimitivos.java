package mx.utng.s05.Reto01;

public class RetoPrimitivos {
    public static void main(String[] args) {

        // Todos los tipos de datos primitivos e
        // imprimir su valor mínimo y máximo utilizando una
        // sola instruccion con la funcion printf

        int valorInt = Integer.MAX_VALUE;
        valorInt++;
        System.out.println(valorInt);

        double valorDouble = Double.MIN_VALUE;
        System.out.printf("%s$n", Double.toString(valorDouble));

        char valorChar1 = Character.MIN_VALUE;
        valorChar1++;
        System.out.println(valorChar1);

    }
}
