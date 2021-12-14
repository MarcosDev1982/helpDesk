package com.marcos.helpdesk.resources;

import com.marcos.helpdesk.domain.DTO.TecnicoDTO;
import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.repositories.TecnicoRepositories;
import com.marcos.helpdesk.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

    @Autowired
   private TecnicoService tecnicoService;

     @GetMapping(value = "/{id}")
     public ResponseEntity<TecnicoDTO> findByID(@PathVariable Integer id){
         Tecnico obj = tecnicoService.findById(id);
        return ResponseEntity.ok().body(new TecnicoDTO(obj));
     }



}
