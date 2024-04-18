package main.java.mx.utng.sesion20.hello.controller;

public class SaludoController {
    
    @RestController
    public class SaludoController{

        @getMapping("/saludo")
        public Saludo saludar(){
            Saludo saludo = new Saludo();
            saludo.setMensaje("Hello World");
            return saludo;
        }
    }
}
