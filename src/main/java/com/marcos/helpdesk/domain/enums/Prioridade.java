package com.marcos.helpdesk.domain.enums;

public enum Prioridade {

    BAIXA(1, "Baixa"),
    MEDIA(2, "Media"),
    ALTA(3, "Alta");

    private Integer cod;
    private String descriccao;

    private Prioridade(int cod, String descriccao) {
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

    public static Prioridade toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (Prioridade x : Prioridade.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
