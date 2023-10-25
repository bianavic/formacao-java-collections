package org.edu.fabs.set.exercicio;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    ComparatorAnoNome() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int ano = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return linguagem1.getNome().compareTo(linguagem2.getNome());
    }

}
