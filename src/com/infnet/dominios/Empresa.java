package com.infnet.dominios;

public class Empresa {

    private final String cnpj;

    private final String nomeFantasia;

    private final Endereco endereco;

    public Empresa(String cnpj, String nomeFantasia, Endereco endereco) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
