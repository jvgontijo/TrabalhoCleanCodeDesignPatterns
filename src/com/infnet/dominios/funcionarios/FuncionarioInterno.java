package com.infnet.dominios.funcionarios;

import com.infnet.dominios.Cargo;

import java.math.BigDecimal;

public interface FuncionarioInterno {

    BigDecimal reajustarSalario();

    Cargo reajustarCargo();

}
