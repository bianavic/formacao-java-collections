package org.edu.fabs.set;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
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

    // perceba que a implementacao possui HASH no nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoEpisodio == serie.tempoEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    // ordenacao por tempoepisodio
    // criterio de DESEMPATE genero
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.tempoEpisodio);
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }

}
