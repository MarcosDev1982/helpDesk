package com.marcos.helpdesk.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tecnico extends Pessoa{


    private List<OrdemdeServico> ordemdeServicos = new ArrayList<>();
}
