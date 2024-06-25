package com.infnet.dominios.funcionarios;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.pessoas.Pessoa;
import com.infnet.dominios.empresarial.Setor;
import com.infnet.dominios.pessoas.Telefone;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Funcionario extends Pessoa {

    private final BigDecimal salario;

    private final Setor setor;

    private final Cargo cargo;

    public Funcionario(
            String nome, ArrayList<Telefone> telefones, Endereco endereco,
            BigDecimal salario, Setor setor, Cargo cargo
    ) {
        super(nome, telefones, endereco);
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public BigDecimal pegarSalario() {
        return salario;
    }

    public Setor pegarSetor() {
        return setor;
    }

    public Cargo pegarCargo() {
        return cargo;
    }

}

