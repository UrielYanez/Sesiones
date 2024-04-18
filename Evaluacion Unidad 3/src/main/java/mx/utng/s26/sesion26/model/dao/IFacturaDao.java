package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.Factura;

public interface IFacturaDao {
    List<Factura> list();
    void save(Factura factura);
    Factura getById(Long id);
    void delete(Long id);
    
} 
