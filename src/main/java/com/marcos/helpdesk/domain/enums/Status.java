package com.marcos.helpdesk.domain.enums;

public enum Status {

    ABERTO(1, "Aberto"),
    ANDAMENTO(2, "Em Andamento"),
    ENCERRADO(3, "Encerrado");

    private Integer cod;
    private String descriccao;

    private Status(int cod, String descriccao) {
        this.cod = cod;
        this.descriccao = descriccao;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescriccao() {
        return descriccao;
    }

    public void setDescriccao(String descriccao) {
        this.descriccao = descriccao;
    }

    public static Status toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (Status x : Status.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }


}
