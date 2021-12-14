package com.marcos.helpdesk.domain.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.marcos.helpdesk.domain.Tecnico;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Data
public class TecnicoDTO {

    private static final long serialVersionUID = 1L;

    protected Integer id;

    protected String nome;

    protected String cpf;

    protected String email;

    protected String senha;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataCricao = LocalDate.now();

    public TecnicoDTO(Tecnico obj) {
    }
}
