package org.edu.fabs.set.exercicio;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    private String nome;
    private Integer  anoDeCriacao;
    private String ide;

    ComparatorNomeAnoIde() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int nome = linguagem1.getNome().compareTo(linguagem2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return linguagem1.getIde().compareTo(linguagem2.getIde());
    }

}
