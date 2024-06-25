package com.infnet.dominios.funcionarios;

import com.infnet.dominios.empresarial.Cargo;

import java.math.BigDecimal;

public interface FuncionarioInternoFactory {

    BigDecimal reajustarSalario();

    Cargo reajustarCargo();

}
