package org.edu.fabs.set;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public ComparatorTempoEpisodio() {
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

    // ordenacao por tempoepisodio
    // criterio de DESEMPATE genero
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int tempoEpisodio = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return serie1.getGenero().compareTo(serie2.getGenero());
    }

}