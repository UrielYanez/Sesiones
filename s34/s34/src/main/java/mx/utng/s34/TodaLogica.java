package main.java.mx.utng.s34;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class TodaLogica {
    private final CasaRepository repository;

    @Autowired    
    public TodaLogica(CasaRepository repository){
        this.repository = repository;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void guardarCasa(@RequestBody Casa casa){
        if(casa.getJefeDeFamilia() == null){
            throw RuntimeException("Se debe de tener un Jefe de familia");
        }
        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String nombre : otrosMayusculas) {
            otrosMayusculas.add(nombre.toUpperCase());
        }

        casa.setOtros(otrosMayusculas);

        repository.save(casa);
    }
}
