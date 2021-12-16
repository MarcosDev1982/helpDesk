package com.marcos.helpdesk.resources;

import com.marcos.helpdesk.domain.DTO.TecnicoDTO;
import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.repositories.TecnicoRepositories;
import com.marcos.helpdesk.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<TecnicoDTO> findByID(@PathVariable Integer id) {
        Tecnico obj = tecnicoService.findById(id);
        return ResponseEntity.ok().body(new TecnicoDTO(obj));
    }

    public ResponseEntity<List<TecnicoDTO>> findAll() {

        List<Tecnico> list = tecnicoService.findAll();
        List<TecnicoDTO> tecnicoDTOList = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(tecnicoDTOList);

    }

    @PostMapping
    public ResponseEntity<TecnicoDTO> insert(@RequestBody TecnicoDTO tecnico) {
        Tecnico obj = tecnicoService.insert(tecnico);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/id").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


}
