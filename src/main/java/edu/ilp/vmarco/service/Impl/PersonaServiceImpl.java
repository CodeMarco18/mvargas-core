package edu.ilp.vmarco.service.Impl;


import edu.ilp.vmarco.dao.IPersonaDao;
import edu.ilp.vmarco.entity.Persona;
import edu.ilp.vmarco.service.Intef.IPersonaServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaServiceIntef {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
