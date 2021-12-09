package com.marcos.helpdesk.services;

import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.OrdemdeServico;
import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.domain.enums.Perfil;
import com.marcos.helpdesk.domain.enums.Prioridade;
import com.marcos.helpdesk.domain.enums.Status;
import com.marcos.helpdesk.repositories.ClienteRepositories;
import com.marcos.helpdesk.repositories.OrdemServircoRepositories;
import com.marcos.helpdesk.repositories.TecnicoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    ClienteRepositories clienteRepositories;

    @Autowired
    TecnicoRepositories tecnicoRepositories;

    @Autowired
    OrdemServircoRepositories ordemServircoRepositories;

    public  void instanciaDB(){
        Tecnico tecnico1 = new Tecnico(null, "Marcos", "72632502411", "alanTeste@hotmail.com", "123");
        tecnico1.addPerfil(Perfil.ADMIN);

        Cliente cliente1 = new Cliente(null, "Linus Torvalds", "21495983536", "test1@hotmail.com", "123");
        System.out.println(cliente1);
        cliente1.addPerfil(Perfil.CLIENTE);

        OrdemdeServico ordemdeServico1 = new OrdemdeServico(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado1", "Primeiro Chamdo",cliente1, tecnico1);

        clienteRepositories.saveAll(Arrays.asList(cliente1));
        tecnicoRepositories.saveAll(Arrays.asList(tecnico1));
        ordemServircoRepositories.saveAll(Arrays.asList(ordemdeServico1));

    }
}
