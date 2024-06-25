package com.infnet.dominios.pessoas;

import java.util.ArrayList;

public abstract class Pessoa {
    private final String nome;

    private final ArrayList<String> telefones;

    private final Endereco endereco;

    public Pessoa(String nome, ArrayList<String> telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public String pegarNome() {
        return nome;
    }

    public ArrayList<String> pegarTelefones() {
        return telefones;
    }

    public Endereco pegarEndereco() {
        return endereco;
    }
}
