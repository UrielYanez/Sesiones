package mx.utng.r17;
/*
 * @Author: Isaac Cano Hernandez
 * @Date: 16/02/2024
 * @Group: GDS0624
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class poema {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\bMARC\\OneDrive\\Documents\\poema.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\n\n");
        bw.write("Podra nublarse el sol eternamente\n");
        bw.write("Podra secarse en un instante el mar\n");
        bw.write("Podra romperse el eje de la tierra.\n");
        bw.write("Como un debil cristal.\n");
        bw.write("Todo sucedera. Podra la muerte\n");
        bw.write("Cubrirme con su funebre crespon\n");
        bw.write("Pero jamás en mí podr apagarse\n");
        bw.write("La llama de tu amor.\n");
        bw.newLine();
        bw.write("------------Autor------------\n");
        bw.write("Isaac Cano Hernandez");
        bw.close();

        FileReader fr = new FileReader("C:\\Users\\bMARC\\OneDrive\\Documents\\poema.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = null;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }
}