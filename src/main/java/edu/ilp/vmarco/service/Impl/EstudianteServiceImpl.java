package edu.ilp.vmarco.service.Impl;

import edu.ilp.vmarco.dao.IEstudianteDao;
import edu.ilp.vmarco.entity.Estudiante;
import edu.ilp.vmarco.service.Intef.IEstudianteServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteServiceIntef {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.estudianteDao.obtenerEstudiantePorCodigo(codigo);
    }
    @Override
    public List<Estudiante> listarEstudiantePorApeNombre(String apenombre) {
        return this.estudianteDao.listarEstudiantesByAppNombre(apenombre);
    }


}
