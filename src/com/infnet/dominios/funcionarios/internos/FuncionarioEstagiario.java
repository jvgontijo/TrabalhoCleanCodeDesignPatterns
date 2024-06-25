package com.infnet.dominios.funcionarios.internos;

import com.infnet.dominios.Cargo;
import com.infnet.dominios.Endereco;
import com.infnet.dominios.Setor;
import com.infnet.dominios.funcionarios.Funcionario;
import com.infnet.dominios.funcionarios.FuncionarioInterno;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioEstagiario extends Funcionario implements FuncionarioInterno {

    public FuncionarioEstagiario(
            String nome,
            ArrayList<String> telefones,
            Endereco endereco,
            BigDecimal salario,
            Setor setor
    ) {
        super(nome, telefones, endereco, salario, setor, Cargo.ESTAGIARIO);
    }

    @Override
    public BigDecimal reajustarSalario() {
        return getSalario().add(getSalario().multiply(BigDecimal.valueOf(0.1)));
    }

    @Override
    public Cargo reajustarCargo() {
        return getCargo().avancar();
    }
}
