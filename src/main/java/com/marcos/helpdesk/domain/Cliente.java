package com.marcos.helpdesk.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente extends Pessoa  {

    private static final long serialVersionUID = 1L;


    @OneToMany(mappedBy = "cliente")
    private List<OrdemdeServico> ordemdeServicos = new ArrayList<>();
}
