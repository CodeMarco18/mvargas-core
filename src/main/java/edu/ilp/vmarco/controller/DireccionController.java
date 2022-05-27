package edu.ilp.vmarco.controller;


import edu.ilp.vmarco.entity.Direccion;
import edu.ilp.vmarco.service.Intef.IDireccionServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("direccion")
public class DireccionController {


    @Autowired
    private IDireccionServiceIntef iDireccionServiceIntef;

    @GetMapping( "/buscarDireccionBycodigo" )
    public Direccion buscarDireccionByCodigo(@RequestParam String codigo) {
        return this.iDireccionServiceIntef.obtenerDireccionPorCodigo (codigo);

    }
}
