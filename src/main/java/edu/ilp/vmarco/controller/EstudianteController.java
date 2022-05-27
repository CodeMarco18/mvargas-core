package edu.ilp.vmarco.controller;

import edu.ilp.vmarco.dao.IEstudianteDao;
import edu.ilp.vmarco.entity.Direccion;
import edu.ilp.vmarco.entity.Estudiante;
import edu.ilp.vmarco.service.Intef.IDireccionServiceIntef;
import edu.ilp.vmarco.service.Intef.IEstudianteServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteServiceIntef estudianteService;


    //Buscar un estudiante por su código
    @GetMapping( "/buscarEstudianteBycodigo" )
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }

    @GetMapping("/listarByAppnombre")
    public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
        return this.estudianteService.listarEstudiantePorApeNombre(appnombre);
    }


}