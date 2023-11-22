package org.trabalhoQuarkus.View;

import java.util.List;

import org.trabalhoQuarkus.Model.OpcaoSelect;

import io.quarkus.qute.TemplateInstance;

public interface CalculadoraTemplate {
    TemplateInstance calculadora(List<OpcaoSelect> operacao, String result);
}
