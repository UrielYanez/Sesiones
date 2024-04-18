package mx.utng.s17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Binario {
    
    public static void main(String[] args) throws FileNotFoundException{
        //Declaramos instancia de DufferendTnpuntString
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("icono.png"));
        //Declaramos instancia de BufferendOuntputStrteam
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("icono_copia.png"));
        //Definimos el buffer de escritura de datos
        byte[] buffer = new byte[1024];
        //iniciar la cipia dl archivo
        int bytesLeidos = 0;
        while ((bytesLeidos = bis.read(buffer))>0){
            bos.write(buffer, 0,bytesLeidos);
        }
        bos.close();
        bis.close();

    }
}