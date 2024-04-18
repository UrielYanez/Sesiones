package mx.utng.s25.sesion25.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.s25.sesion25.model.dao.IMateriaDao;
import mx.utng.s25.sesion25.model.entity.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

    @Autowired
    private IMateriaDao materiaDao;

    @Transactional(readOnly=true)
    @Override
    public List<Materia> list() {
        return materiaDao.list();
    }

    @Transactional
    @Override
    public void save(Materia materia) {
        materiaDao.save(materia);
    }

    @Transactional(readOnly=true)
    @Override
    public Materia getById(Long id) {
        return materiaDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(long id) {
        materiaDao.delete(id);
    }
    
}
