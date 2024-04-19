package mx.utng.session29.persistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.session29.model.Partido;

public interface PartidoRepository extends CrudRepository<Partido, Long>{
    
}
