package com.marcos.helpdesk;

import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.OrdemdeServico;
import com.marcos.helpdesk.domain.Pessoa;
import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.domain.enums.Perfil;
import com.marcos.helpdesk.domain.enums.Prioridade;
import com.marcos.helpdesk.domain.enums.Status;
import com.marcos.helpdesk.repositories.ClienteRepositories;
import com.marcos.helpdesk.repositories.OrdemServircoRepositories;
import com.marcos.helpdesk.repositories.TecnicoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class HelpDeskApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelpDeskApplication.class, args);
    }


}
