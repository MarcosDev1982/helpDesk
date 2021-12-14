package com.marcos.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marcos.helpdesk.domain.enums.Perfil;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
public class Tecnico extends Pessoa{

    @JsonIgnore
    @OneToMany(mappedBy = "tecnico")
    private List<OrdemdeServico> ordemdeServicos = new ArrayList<>();

    public Tecnico(){
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Tecnico(Integer id , String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.CLIENTE);
    }
    public List<OrdemdeServico> getOrdemService(){
        return (ordemdeServicos);
    }

    public List<OrdemdeServico> setOrdemService(List<OrdemdeServico> odservcice){
        this.ordemdeServicos = odservcice;
        return  ordemdeServicos;
    }
}
