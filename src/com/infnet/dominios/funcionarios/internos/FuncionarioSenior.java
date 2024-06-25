package com.infnet.dominios.funcionarios.internos;

import com.infnet.dominios.Cargo;
import com.infnet.dominios.Endereco;
import com.infnet.dominios.Setor;
import com.infnet.dominios.funcionarios.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioSenior extends Funcionario implements FuncionarioInternoSenior {

    public FuncionarioSenior(
            String nome,
            ArrayList<String> telefones,
            Endereco endereco,
            BigDecimal salario,
            Setor setor
    ) {
        super(nome, telefones, endereco, salario, setor, Cargo.SENIOR);
    }

    @Override
    public BigDecimal reajustarSalario() {
        return getSalario().add(getSalario().multiply(BigDecimal.valueOf(0.4)));
    }

}
