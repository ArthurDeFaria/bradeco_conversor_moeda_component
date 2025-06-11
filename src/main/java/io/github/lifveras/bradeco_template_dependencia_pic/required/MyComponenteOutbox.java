package io.github.lifveras.bradeco_template_dependencia_pic.required;

import io.github.lifveras.bradeco_template_dependencia_pic.provided.interfaces.MyComponentProvidedInterface;
import io.github.lifveras.bredeco_pic_abstract.required.StandardPortOutbox;

// Definir somente se houver componente requerido
public class MyComponenteOutbox extends StandardPortOutbox implements MyComponentProvidedInterface {

    @Override
    public int methodProvided1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodProvided1'");
    }

    @Override
    public String methodProvided2(String param1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodProvided2'");
    }

}
