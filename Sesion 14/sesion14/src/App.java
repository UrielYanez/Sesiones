import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        String[]cadenas = new String[5];
        cadenas [0] = "Zanahoria" ;
        cadenas [1] = "Cilantro" ;
        cadenas [2] = "Lechuga" ;
        cadenas [3] = "Repollo" ;
        cadenas [4] = "Coliflor" ;

        

        System.out.println(cadenas);
        System.out.println("----Foreach----");
        for (String c : cadenas){
            System.out.println(c);
        }
        System.out.println("---For i---");
        for (int i = 0; i < cadenas.length; i++){
            System.out.println(cadenas[i]);
        }
        List<String> verduras = new ArrayList();
        for (int i = 0; i < 10; i++) {
            verduras.add("Verdura "+(i+1));

        }
        for (String v: verduras){
            System.out.println(v);
        }
        System.out.println("----Cambiar----");
        verduras.set(0, "Zanahoria");
        verduras.set(1, "Cilantro");
        verduras.set(2, "Cebolla");
        verduras.set(3, "Ajo");
        verduras.remove(4);
        for (int i= 4; i <= verduras.size(); i++) {
            verduras.remove(i);

        }
        verduras.remove("Verdura 7");
        verduras.remove("Verdura 9");
        Collections.addAll(verduras,"Repollo", "Lechuga", "Coliflor");
       
        for (String v : verduras){
            System.out.println(v);
        }

        Collections.reverse(verduras);
        System.out.println(verduras);

        System.out.println("El mas pequeño es:"+Collections.min(verduras));
        System.out.println("El mas grande es:"+Collections.max(verduras));
        Collections.sort(verduras);
        System.out.println(verduras);
        System.out.println("La lechuga esta en la posición:"
        + Collections.binarySearch(verduras,"Lechuga"));
        System.out.println("El Cilantro esta en la posición:"
        + Collections.binarySearch(verduras,"Cilantro"));

       
        Collections.addAll(verduras,"Lechuga","Lecguga","Lechuga");
        System.out.println(verduras);

        Collections.shuffle(verduras);
        System.out.println(verduras);

        System.out.println("Hay"+Collections.frequency(verduras,"Lechuga")+"lechugas");

    }
}
