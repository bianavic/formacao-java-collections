package org.edu.fabs.map.complementar;

import java.util.Objects;

public class Curso implements Comparable<Curso> {

    private String nome;
    private Integer disciplina;

    public Curso(String nome, Integer disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Integer disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome) && Objects.equals(disciplina, curso.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, disciplina);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }


    @Override
    public int compareTo(Curso curso) {
        return this.getNome().compareToIgnoreCase(curso.getNome());
    }

}
