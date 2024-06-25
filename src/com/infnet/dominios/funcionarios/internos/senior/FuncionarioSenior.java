package com.infnet.dominios.funcionarios.internos.senior;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.empresarial.Setor;
import com.infnet.dominios.funcionarios.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioSenior extends Funcionario implements FuncionarioInternoSeniorFactory {

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
    public BigDecimal reajustarSalario(double valor) {
        return pegarSalario().add(BigDecimal.valueOf(valor));
    }

}