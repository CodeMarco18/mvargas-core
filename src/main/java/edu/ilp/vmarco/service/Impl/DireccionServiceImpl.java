package edu.ilp.vmarco.service.Impl;

import edu.ilp.vmarco.dao.IDireccionDao;
import edu.ilp.vmarco.entity.Direccion;
import edu.ilp.vmarco.service.Intef.IDireccionServiceIntef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionServiceIntef  {

    @Autowired
    IDireccionDao direccionDao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.direccionDao.obtenerDireccionPorCodigo(codigo);
    }
}
