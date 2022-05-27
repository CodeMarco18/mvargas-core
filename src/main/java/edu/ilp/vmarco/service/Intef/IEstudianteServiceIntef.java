package edu.ilp.vmarco.service.Intef;

import edu.ilp.vmarco.entity.Estudiante;

import java.util.List;

public interface IEstudianteServiceIntef {
    Estudiante obtenerEstudiantePorCodigo(String codigo);

    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
