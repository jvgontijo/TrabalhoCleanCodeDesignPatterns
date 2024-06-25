package com.infnet.dominios.empresarial;

public enum Cargo {
    ESTAGIARIO, JUNIOR, PLENO, SENIOR;

    public Cargo avancar() {
        return values()[this.ordinal() + 1 % values().length];
    }
}
