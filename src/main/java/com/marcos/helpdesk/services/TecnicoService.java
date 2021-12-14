package com.marcos.helpdesk.services;

import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.repositories.TecnicoRepositories;
import com.marcos.helpdesk.resources.TecnicoResource;
import com.marcos.helpdesk.services.exception.ObjectnotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepositories tecnicoRepositories;

    public Tecnico findById(Integer id){
      Optional<Tecnico> obj = tecnicoRepositories.findById(id);
        return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));
    }
}
