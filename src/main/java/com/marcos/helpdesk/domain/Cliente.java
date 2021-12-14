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
public class Cliente extends Pessoa  {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<OrdemdeServico> ordemdeServicos = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id , String nome, String cpf, String email, String senha){
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.CLIENTE);
    }


}
