package com.marcos.helpdesk.repositories;

import com.marcos.helpdesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepositories extends JpaRepository<Pessoa, Integer> {

}
