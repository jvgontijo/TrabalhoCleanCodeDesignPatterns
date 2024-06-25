package com.infnet.dominios.funcionarios.internos.estagiario;

import com.infnet.dominios.empresarial.Cargo;
import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.pessoas.Pessoa;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Estagiario extends Pessoa implements FuncionarioEstagiarioFactory {

    private final BigDecimal bolsaAuxilio;

    private final Cargo cargo;

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

    public BigDecimal pegarBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public Cargo pegarCargo() {
        return cargo;
    }

    @Override
    public BigDecimal reajustarBolsaAuxilio(double valor) {
        return this.bolsaAuxilio.add(BigDecimal.valueOf(valor));
    }

    @Override
    public Cargo reajustarCargo() {
        return this.pegarCargo().avancar();
    }
}
