package mx.utng.s17;

import java.io.File;

public class Reto1 {
    public static void main(String[]args){
        //poner la ruta del archivo entre comillas
        File directorioInicial = new File("C:\\Users\\bMARC\\OneDrive\\Documents\\Cuatrimestre 2\\Programación Objetos\\temp");
    }
    private static void muestraContenidoDirectorio(File directorio){
        //Poner la marca de inicio y el nombre del primer directorio
        colocarEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());
        //Crear un arreglo de subdirectorios
        File[] subdirectorios = directorio.listFiles();

        //Recorrer la lista de archivos y verificamos que sean A o D
        For (File archivo : subdirectorios){
            //Verificar si es archivo
            if(archivo.isFile()){
                colocarEspacios(archivo.getParent(), 'A');
            }else if (archivo.isDirectory()){
                muestraContenidoDirectorio(directorio);
            }
        }
    }

    private static void colocarEspacios(String padre,char simbolo){
        //Colocar la marca de inicio de linea [A]- Archivo [D]-Directorio
        System.out.print("['+simbolo+']");

        //Colocar series de guiones de acuerdo ala profundidad del directorio
        for (int i = 0; i < padre.length(); i++ ){
            System.out.print("-");
        }

    }
}
