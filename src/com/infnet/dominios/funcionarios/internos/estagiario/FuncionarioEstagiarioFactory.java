package com.infnet.dominios.funcionarios.internos.estagiario;

import com.infnet.dominios.empresarial.Cargo;

import java.math.BigDecimal;

public interface FuncionarioEstagiarioFactory {

    BigDecimal reajustarBolsaAuxilio();

    Cargo reajustarCargo();

}
