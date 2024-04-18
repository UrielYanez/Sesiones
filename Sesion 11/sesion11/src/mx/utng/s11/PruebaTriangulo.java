package mx.utng.s11;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0, "Color Pastel");
        System.out.println("Info. del triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su área es: "+triangulo.area());

        Triangulo triangulo1 = new Triangulo(20, 10, "Color Verde");
        System.out.println("Info. del triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su área es: "+triangulo1.area());

        Triangulo triangulo2 = new Triangulo(8, 6, "Color Cyan");
        System.out.println("Info. del triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su área es: "+triangulo2.area());
    }
}
