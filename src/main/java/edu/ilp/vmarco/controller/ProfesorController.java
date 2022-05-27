package edu.ilp.vmarco.controller;


import edu.ilp.vmarco.entity.Curso;
import edu.ilp.vmarco.service.Intef.IProfesorServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profesor")
public class ProfesorController {

    @Autowired
    private IProfesorServiceIntef iProfesorServiceIntef;

    @GetMapping( "/listarCursosProfesor" )
    public List<Curso> obtenerCursosProfesor(@RequestParam Long idprofesor){
        return iProfesorServiceIntef.obtenerCursoPorProfesor (idprofesor);
    }


}
