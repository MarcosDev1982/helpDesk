package com.marcos.helpdesk.repositories;

import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.OrdemdeServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServircoRepositories extends JpaRepository<OrdemdeServico, Integer> {

}
