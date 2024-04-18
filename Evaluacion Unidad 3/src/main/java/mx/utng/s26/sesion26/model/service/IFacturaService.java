package mx.utng.s26.sesion26.model.service;

import java.util.List;
import mx.utng.s26.sesion26.model.entity.Factura;

public interface IFacturaService {
    List<Factura> list();
    void save(Factura factura);
    Factura getById(Long id);
    void delete(Long id);
}
