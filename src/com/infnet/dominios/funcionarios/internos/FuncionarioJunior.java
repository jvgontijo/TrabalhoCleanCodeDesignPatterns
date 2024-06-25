package com.infnet.dominios.funcionarios.internos;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.empresarial.Setor;
import com.infnet.dominios.funcionarios.Funcionario;
import com.infnet.dominios.funcionarios.FuncionarioInternoFactory;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioJunior extends Funcionario implements FuncionarioInternoFactory {

    public FuncionarioJunior(
            String nome,
            ArrayList<String> telefones,
            Endereco endereco,
            BigDecimal salario,
            Setor setor
    ) {
        super(nome, telefones, endereco, salario, setor, Cargo.JUNIOR);
    }

    @Override
    public BigDecimal reajustarSalario(double valor) {
        return pegarSalario().add(BigDecimal.valueOf(valor));
    }

    @Override
    public Cargo reajustarCargo() {
        return pegarCargo().avancar();
    }
}
