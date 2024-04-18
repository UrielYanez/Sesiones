package test.java.mx.utng.s31;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;
import main.java.mx.utng.s31.Ejercicio2;

public class Ejercicio2Tests {
    private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, -5, 9);
    
    @Test
    @DisplayName("Prueba para transformar a negativos")
    void canTransformNegatives(){
        Ejercicio2 e2 = new Ejercicio2();
        List<Integer> real = e2.transformar(CONJUNTO, s -> -s);
        assertThat(real).containsExactly(-1, -4, -6, -2, 5, -9);
    }

    void canTransformAndAdd(){
        Ejercicio2 e2 = new Ejercicio2();

        Integer real = e2.transformarYSumar(CONJUNTO, s -> 1);
        assertThat(real).isEqualTo(CONJUNTO.size());
    }
}
