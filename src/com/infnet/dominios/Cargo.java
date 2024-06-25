package com.infnet.dominios;

import java.math.BigDecimal;

public enum Cargo {
    ESTAGIARIO, JUNIOR, PLENO, SENIOR;

    public Cargo avancar() {
        return values()[this.ordinal() + 1 % values().length];
    }
}
