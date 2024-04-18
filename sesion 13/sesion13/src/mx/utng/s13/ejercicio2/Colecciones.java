package mx.utng.s13.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Uno");
        listaCadenas.add("Dos");
        listaCadenas.add("Tres");
        listaCadenas.add("Cuatro");
        listaCadenas.add("Cinco");

        System.out.println(listaCadenas);
        
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.printf("%s%n", listaCadenas.get(i));            
        }

        for (String string : listaCadenas){
            System.out.println(string);
        }
    }
}
