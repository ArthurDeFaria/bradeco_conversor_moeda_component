package io.github.arthurdefaria.conversormoeda.provided;

import io.github.arthurdefaria.conversormoeda.internal.ConversorMoeda;
import io.github.arthurdefaria.conversormoeda.required.interfaces.TaxaCambioRequiredInterface;

public class ConversorMoedaConcreteInterfacePort implements ConversorMoedaConcreteInterface {

    private final ConversorMoeda conversorMoeda;

    public ConversorMoedaConcreteInterfacePort(TaxaCambioRequiredInterface taxaCambio) {
        this.conversorMoeda = new ConversorMoeda(taxaCambio);
    }

    @Override
    public double converter(String moedaOrigem, String moedaDestino, double valor) {
        return conversorMoeda.converter(moedaOrigem, moedaDestino, valor);
    }

}
