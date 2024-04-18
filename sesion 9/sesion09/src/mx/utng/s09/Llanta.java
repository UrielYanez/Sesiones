package mx.utng.s09;

public class Llanta {
    //Variables de instancia
    private float ancho;
    private float diametro;
    private float presion;

    //Metodo para mostrar al rodar
    public void rodar() {
        System.out.println("Rodando...");
    }

    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    
}
