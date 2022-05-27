package edu.ilp.vmarco.dao;

import edu.ilp.vmarco.entity.Curso;
import edu.ilp.vmarco.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {

    @Query("SELECT p.asignaturas FROM Profesor p WHERE p.idProfesor = :idProfesor")
    List<Curso> obtenerCursoPorProfesor(@Param("idProfesor") Long idProfesor);
}
