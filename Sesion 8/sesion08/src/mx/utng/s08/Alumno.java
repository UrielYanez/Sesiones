package mx.utng.s08;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;


    {
        curso = "Programación Orientada a Objetos";
        sesion = 8;
        objetivo = "Aprender el paradigma orientado a Objetos";
    }

    {
        curso = "Como ser carpintero";
        objetivo = "Ganar dinero";
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    
}
