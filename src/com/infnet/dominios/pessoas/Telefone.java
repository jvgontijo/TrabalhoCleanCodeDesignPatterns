package com.infnet.dominios.pessoas;

public class Telefone {

    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public boolean validarNumero() {
        return validarNumeroComFormatacao() || validarNumeroSemFormatacao();
    }

    private boolean validarNumeroComFormatacao() {
        return this.numero.matches("^\\([1-9]{2}\\) (?:[2-8]|9[0-9])[0-9]{3}\\-[0-9]{4}$\n");
    }

    private boolean validarNumeroSemFormatacao() {
        return this.numero.matches("^[1-9]{2}[0-9]{4}[0-9]{4}$");
    }

}
