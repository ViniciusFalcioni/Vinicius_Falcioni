package org.trabalhoQuarkus.View;

import java.util.List;

import org.trabalhoQuarkus.Model.OpcaoSelect;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;

public class CalculadoraTemplateImpl implements CalculadoraTemplate{
    @Inject
    Template Calculadora;

    @Override
    public TemplateInstance calculadora(List<OpcaoSelect> operacao, String result){
        return Calculadora.data("operacao", operacao).data("result", result);
    }
}
