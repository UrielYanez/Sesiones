import java.util.function.Function;

import main.java.mx.utng.s31.StringToInteger;

public class Ejercicio1 {
    
    //private final StringToInteger parser = s -> Integer.parseInt(s); 
    //private final StringToInteger parser = Integer::parseInt;
    private final Function<String, Integer> parser = Integer::parseInt;

    Integer sumar(String a, String b){
        return parser.apply(a) + parser.apply(b);
    }
    
}
