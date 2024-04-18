package mx.utng.s26.sesion26.model.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.s26.sesion26.model.entity.Factura;
/*
 * Clase repositorio o dao, utilizare la 
 * anotacion @Repository
 */

@Repository
public class FacturaDaoImpl implements IFacturaDao {
    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Factura> list() {
        return em.createQuery("from Factura").getResultList();
    }

    @Override
    public void save(Factura factura) {
        System.out.println("Factura id="+factura.getId());
        if(factura.getId() != null && factura.getId() >0){
            //Actualizo estudiante
            em.merge(factura);
        }else{
            //Creamos nuevo estudiante en la base
            em.persist(factura);
        }
    }

    @Override
    public Factura getById(Long id) {
        return em.find(Factura.class, id);
    }

    @Override
    public void delete(Long id) {
        Factura factura = getById(id);
        em.remove(factura);
    }

    
}