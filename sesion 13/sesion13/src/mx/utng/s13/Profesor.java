package mx.utng.s13;

public class Profesor extends Persona{
    private String idProfesor;

   public Profesor (String nombre, String apellidos, String idProfesor){
    super(nombre, apellidos);
    this.idProfesor = idProfesor;
   }
}
