package com.marcos.helpdesk.domain.enums;

public enum Perfil {

    ADMIN(1, "Adiminatrador"),
    CLIENTE(2, "Cliente"),
    TECNICO(3, "Tecnico");

    private Integer cod;
    private String descriccao;

    private Perfil(int cod, String descriccao) {
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

    public static Perfil toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }


}
