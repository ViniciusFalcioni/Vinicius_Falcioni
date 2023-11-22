package br.fag.model;

public class Resultado {
    public float valor;
    public String mensagemErro;
    public Resultado(float valor) {
        this.valor = valor;
    }

    public Resultado(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }

    public boolean temErro() {
        return mensagemErro != null;
    }
}
