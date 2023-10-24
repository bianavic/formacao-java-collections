package org.edu.fabs.set;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public ComparatorGenero() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(int tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "ComparatorGenero{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    // ordenacao por genero
    // criterio de DESEMPATE nome
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return serie1.getNome().compareTo(serie2.getNome());
    }

}