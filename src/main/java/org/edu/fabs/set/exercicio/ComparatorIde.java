package org.edu.fabs.set.exercicio;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

    private String nome;
    private Integer  anoDeCriacao;
    private String ide;

    ComparatorIde() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // por IDE
    // desempate: ano
    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
        int ide = linguagem1.getIde().compareTo(linguagem2.getIde());
        if (ide != 0 ) return ide;

        return Integer.compare(linguagem1.getAnoDeCriacao(), linguagem2.getAnoDeCriacao());
    }

}
