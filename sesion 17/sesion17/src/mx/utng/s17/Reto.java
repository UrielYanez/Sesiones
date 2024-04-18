package mx.utng.s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reto{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\bMARC\\OneDrive\\Documents\\poema.txt");  //Ruta del archivo

        //Escribir poema
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("A veces nuestros labios, como locas \n"+
            "mariposas de amor, se perseguían \n"+
            "los tuyos de los míos siempre huían, \n"+
            "y siempre se juntaban nuestras bocas. \n"+
            
            "Los míos murmuraban: -¡Me provocas! \n"+
            "Los tuyos: -¡Me amedrentas!, respondían \n"+
            "y aunque siempre a la fuga se atenían, \n"+
            "las veces que fugaron fueron pocas. \n"+
            
            "Recuerdo que, una tarde, la querella \n"+
            "en el jardín, llevando hasta el exceso, \n"+
            "quisiste huir, mas, por mi buena estrella, \n"+
            
            "en una rosa el faldellín fue preso, \n"+
            "y que, después, besé, la rosa aquella, \n"+
            "por haberme ayudado a darte un beso. \n\n"+
            "Autor: Manuel Ugarte");
                       
            bw.newLine();
            bw.write("");
            bw.newLine();
            bw.close();

            
            FileReader fr = new FileReader("C:\\Users\\bMARC\\OneDrive\\Documents\\poema.txt");  //Ruta del archivo
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
    }
}