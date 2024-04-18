package mx.utng.s12.Reto;
/**
* @author: Uriel Yáñez Aguayo
* @date: 06-Febrero-2024
* @group: GDS0624
*/
public class PruebaFigura {

        public static void main(String[] args) {
            Figura figura;
    
            
            figura = new Triangulo();
            figura.formulaCalculaArea();
          
            figura = new Rectangulo();
            figura.formulaCalculaArea();
    
            figura = new Cuadrado();
            figura.formulaCalculaArea();
        }
    }

