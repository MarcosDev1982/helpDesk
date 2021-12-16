package com.marcos.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marcos.helpdesk.domain.DTO.TecnicoDTO;
import com.marcos.helpdesk.domain.enums.Perfil;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@AllArgsConstructor
public class Tecnico extends Pessoa {
    @JsonIgnore
    @OneToMany(mappedBy = "tecnico")
    private List<OrdemdeServico> ordemdeServicos = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.CLIENTE);
    }

    public Tecnico(TecnicoDTO obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.cpf = obj.getCpf();
        this.email = obj.getEmail();
        this.senha = obj.getSenha();
        this.perfis = obj.getPerfis().stream().map(x -> x.getCod()).collect(Collectors.toSet());
        this.dataCriacao = obj.getDataCriacao();
    }

    public List<OrdemdeServico> getOrdemServicos() {
        return ordemdeServicos;
    }

    public void setOrdemServicos(List<OrdemdeServico> chamados) {
        this.ordemdeServicos = ordemdeServicos;
    }
}
