package mx.utng.sesion4;

public class LectorTest {
    public static void main(String[] args) {
        Lector lector = new Lector();

        lector.muestraMensaje("Teclea tu nombre: ");
        String nombre = lector.leerEntrada();

        lector.muestraMensaje("Hola "+nombre);

        lector.muestraMensaje("Hola", nombre);
        
    }
}
