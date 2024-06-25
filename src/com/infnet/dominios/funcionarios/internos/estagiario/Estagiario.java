package com.infnet.dominios.funcionarios.internos.estagiario;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.pessoas.Pessoa;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Estagiario extends Pessoa implements FuncionarioEstagiarioFactory {

    private BigDecimal bolsaAuxilio;

    private Cargo cargo;

    public Estagiario(
            String nome,
            ArrayList<String> telefones,
            Endereco endereco,
            BigDecimal bolsaAuxilio
    ) {
        super(nome, telefones, endereco);
        this.bolsaAuxilio = bolsaAuxilio;
        this.cargo = Cargo.ESTAGIARIO;
    }

    public BigDecimal getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public BigDecimal reajustarBolsaAuxilio() {
        return this.bolsaAuxilio.add(this.bolsaAuxilio.multiply(BigDecimal.valueOf(0.1)));
    }

    @Override
    public Cargo reajustarCargo() {
        return this.getCargo().avancar();
    }
}
