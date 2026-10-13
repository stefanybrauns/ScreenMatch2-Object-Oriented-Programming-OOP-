package br.com.alura.screenmatch.modelos;

import br.com.alura.sreenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretora;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretora() {
        return diretora;
    }

    public void setDiretora(String diretora) {
        this.diretora = diretora;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
