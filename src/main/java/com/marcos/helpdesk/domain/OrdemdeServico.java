package com.marcos.helpdesk.domain;

import com.marcos.helpdesk.domain.enums.Prioridade;
import com.marcos.helpdesk.domain.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class OrdemdeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dataAbertura;

    private Date dataFechemento;

    private Prioridade prioridade;

    private Status status;

    private String titulo;

    private String observacoes;

    private Cliente cliente;

    private  Tecnico tecnico;


}
