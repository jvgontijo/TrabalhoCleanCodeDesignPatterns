package com.infnet.dominios.funcionarios;

import com.infnet.dominios.Cargo;
import com.infnet.dominios.Endereco;
import com.infnet.dominios.Pessoa;
import com.infnet.dominios.Setor;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Funcionario extends Pessoa {

    private final BigDecimal salario;

    private final Setor setor;

    private final Cargo cargo;

    public Funcionario(
            String nome, ArrayList<String> telefones, Endereco endereco,
            BigDecimal salario, Setor setor, Cargo cargo
    ) {
        super(nome, telefones, endereco);
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

}

