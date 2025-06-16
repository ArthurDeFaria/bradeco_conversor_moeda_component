package io.github.arthurdefaria.conversormoeda.internal;

import io.github.arthurdefaria.conversormoeda.required.interfaces.TaxaCambioRequiredInterface;

public class ConversorMoeda {

    private final TaxaCambioRequiredInterface taxaCambio;

    public ConversorMoeda(TaxaCambioRequiredInterface taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        double taxa = taxaCambio.obterTaxaCambio(moedaOrigem, moedaDestino);
        return valor * taxa;
    }

}