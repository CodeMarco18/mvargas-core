package edu.ilp.vmarco.service.Impl;

import edu.ilp.vmarco.dao.IProfesorDao;
import edu.ilp.vmarco.entity.Curso;
import edu.ilp.vmarco.service.Intef.IProfesorServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorServiceIntef {

    @Autowired
    IProfesorDao profesordao;

    @Override
    public List<Curso> obtenerCursoPorProfesor(Long idprofesor)  {
        return this.profesordao.obtenerCursoPorProfesor (idprofesor);
    }
}
