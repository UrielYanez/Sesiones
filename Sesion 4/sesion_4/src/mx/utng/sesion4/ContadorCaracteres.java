package mx.utng.sesion4;

public class ContadorCaracteres {
    
    public boolean isVocal(char caracter){
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
    public boolean isConsonante(char caracter){
        short codigoAscii = (short)caracter;
        return (codigoAscii >=97 && codigoAscii <= 122) && !isVocal(caracter);
    }
    public boolean isNumero(char caracter){
        short codigoAscii = (short)caracter;
        return codigoAscii >= 48 && codigoAscii <= 57;
    }
    public boolean isSimbolo(char caracter){
        return !isVocal(caracter) && !isConsonante(caracter) && !isNumero(caracter);
    }
    public int cuentaVocales(String palabra){
        int contador = 0;
        for(int i=0; i < palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if(isVocal(caracter)){
                contador++;
            }
        }
        return contador;
    }
    public int cuentaConsonantes(String palabra){
        int contador = 0;
        for(int i = 0; i<palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if(isConsonante(caracter)){
                contador++;
            }
        }
        return contador;
    }
    public int cuentaNumeros(String palabra){
        int contador = 0;
        for(int i = 0; i< palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if (isNumero(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    public int cuentaSimbolos(String palabra){
        int contador = 0;
        for(int i=0; i<palabra.length(); i++){
            char caracter = palabra.charAt(i);
            if (isSimbolo(caracter)) {
                contador++;
            }
        }
        return contador;
    }
}