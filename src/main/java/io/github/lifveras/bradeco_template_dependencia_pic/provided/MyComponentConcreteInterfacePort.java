package io.github.lifveras.bradeco_template_dependencia_pic.provided;

import io.github.lifveras.bradeco_template_dependencia_pic.provided.interfaces.MyComponentProvidedInterface;
import io.github.lifveras.bredeco_pic_abstract.provided.InterfacePort;

// Classe Concreta de Porto de Interface
public class MyComponentConcreteInterfacePort extends InterfacePort implements MyComponentProvidedInterface {

    @Override
    public void initialize() {
        // TODO Apagar e implementar a inicialização
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override
    public int methodProvided1() {
        // TODO Implementação dos métodos da Interface Provida
        throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

    @Override
    public String methodProvided2(String param1) {
        // TODO Implementação dos métodos da Interface Provida
        throw new UnsupportedOperationException("Unimplemented method 'method2'");
    }
}
