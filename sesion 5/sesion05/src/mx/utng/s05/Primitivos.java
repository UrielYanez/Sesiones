package mx.utng.s05;

public class Primitivos {
    public static void main(String[] args) {
        //Entero muy pequeño (-128 a 127)
        byte valorByte = 10;
        System.out.println(valorByte);

        //Entero corto (-32,768 a 32,767)
        short valorShort = 30000;

        //Entero Base (–2,147,483,648 a 2,147,483,647)
        int valorInt = 2000000000;

        //Entero mas largo (–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
        long valorLong = 100000000000000000l;   //Lleva una L al final del número

        //Número real con punto decimal      //Redondea el valor a 7 decimales
        float valorFloat = 7.554121354512f;    //Lleva una F al final

        //Numero real con precision doble    //Puede llevar 16 cifras despues del punto
        double valorDouble = 3.5;

        //Valor booleano con solo dos valores Verdadero/Falso
        boolean valorBoolean = true;

        //Primitivo para texto
        char valorChar = 'b';

        System.out.printf("Valor Boolenano: %b %n Valor Char: %c%n", valorBoolean, valorChar);
        
        float numFloat = 1.5f;
        int numInt1 = (int)numFloat; //Se le agrega (int) para convertir el número
        System.out.printf("Flotante: %f, Entero: %d%n", numFloat, numInt1);

        char numChar = 'M';
        numChar++;
        int numInt2 = numChar;
        System.err.printf("Char: %c, Entero: %d%n", numChar, numInt2);
    }

}
