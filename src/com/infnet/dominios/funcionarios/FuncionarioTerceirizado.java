package com.infnet.dominios.funcionarios;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.empresarial.Empresa;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.empresarial.Setor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioTerceirizado extends Funcionario {
    private final Empresa empresaContratada;

    private final LocalDate tempoPrevistoDePermanencia;

    public FuncionarioTerceirizado(
            String nome,
            ArrayList<String> telefones,
            Endereco endereco,
            BigDecimal salario,
            Setor setor,
            Cargo cargo,
            Empresa empresaContratada,
            LocalDate tempoPrevistoDePermanencia
    ) {
        super(nome, telefones, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
    }

    public Empresa getEmpresaContratada() {
        return empresaContratada;
    }

    public LocalDate getTempoPrevistoDePermanencia() {
        return tempoPrevistoDePermanencia;
    }

}
