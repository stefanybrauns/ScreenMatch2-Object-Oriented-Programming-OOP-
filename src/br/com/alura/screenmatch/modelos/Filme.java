package br.com.alura.screenmatch.modelos;

import br.com.alura.sreenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretora;

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
}
