package com.marcos.helpdesk.domain;

import com.marcos.helpdesk.domain.enums.Perfil;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
public abstract class Pessoa {

    protected   Integer id;

    protected String nome;

    protected String cpf;

    protected   String email;

    protected String senha;

    protected Set<Integer> perfis = new HashSet<>();

    protected LocalDate dataCricao = LocalDate.now();


}
