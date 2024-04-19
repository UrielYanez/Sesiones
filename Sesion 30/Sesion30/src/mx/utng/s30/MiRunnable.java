package mx.utng.s30;

import java.util.concurrent.TimeUnit;

public class MiRunnable implements Runnable{
    //Atributos
    private String parametro;
    private String nombre;

    //constructor
    public MiRunnable(String nombre){
        this.nombre = nombre;
    }

    //Setter de parametro
    public void setParametro(String parametro){
        this.parametro = parametro;
    }

    //Metodo sobreescrito de la interfaz Runnable
    @Override
    public void run() {
        while (!"Terminar".equals(parametro)){
            mostrarInformacion();
            pausarUnSegundo();
        }
        mostrarInformacion();
    }
    
    //Metodo que pausa la ejecucion del hilo un segundo
    public static void pausarUnSegundo(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //metodo para mostrar el mensaje si el programa funciona 
    private void mostrarInformacion(){
        System.out.println("Hilo: "+nombre+"\t| Parametro: "+parametro);
    }

}