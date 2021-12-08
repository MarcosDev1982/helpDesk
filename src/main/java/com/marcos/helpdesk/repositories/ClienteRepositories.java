package com.marcos.helpdesk.repositories;

import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositories extends JpaRepository<Cliente, Integer> {

}
