package com.marcos.helpdesk.repositories;

import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepositories extends JpaRepository<Tecnico, Integer> {

}
