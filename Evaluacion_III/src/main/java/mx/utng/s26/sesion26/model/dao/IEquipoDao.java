package mx.utng.s26.sesion26.model.dao;

import java.util.List;

import mx.utng.s26.sesion26.model.entity.Equipo;


public interface IEquipoDao {
    List<Equipo> list();
    void save(Equipo equipo);
    Equipo getById(Long id);
    void delete(Long id);
    
} 
