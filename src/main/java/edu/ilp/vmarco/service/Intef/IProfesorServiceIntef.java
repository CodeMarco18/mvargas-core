package edu.ilp.vmarco.service.Intef;

import edu.ilp.vmarco.entity.Curso;

import java.util.List;

public interface IProfesorServiceIntef {
    List<Curso> obtenerCursoPorProfesor(Long idprofesor);
}
