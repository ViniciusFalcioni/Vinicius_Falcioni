package org.trabalhoQuarkus.Model;

public class OpcaoSelect {
    private String valor;
    private String texto;

    public OpcaoSelect(String valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }

    public String getValor() {
        return valor;
    }

    public String getTexto() {
        return texto;
    }
}