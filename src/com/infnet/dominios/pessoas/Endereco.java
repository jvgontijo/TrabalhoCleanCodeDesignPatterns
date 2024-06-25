package com.infnet.dominios.pessoas;

public class Endereco {

    private final String rua;

    private final String bairro;

    private final int numero;

    private final String cep;

    private final String cidade;

    private final String uf;

    public Endereco(String rua, String bairro, int numero, String cep, String cidade, String uf) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
