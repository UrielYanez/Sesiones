package mx.utng.s11.Reto1;

import java.time.LocalDate;


    public class DBA extends Empleado {
    private String herramientasConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientasConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientasConsultas = herramientasConsultas;
    }

    public String getHerramientasConsultas() {
        return herramientasConsultas;
    }

    public void setHerramientasConsultas(String herramientasConsultas) {
        this.herramientasConsultas = herramientasConsultas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Herramientas de Consultas: " + getHerramientasConsultas();
    }
}
