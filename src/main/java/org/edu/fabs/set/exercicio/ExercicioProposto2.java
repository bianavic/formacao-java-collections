package org.edu.fabs.set.exercicio;

import java.text.ParseException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto2 {

    /**
     * crie conjunto com 3 linguagens
     * ordene conjunto por:
     * ordem insercao
     * ordem natural - nome
     * ide
     * ano criacao e nome
     * nome, ano criacao, e ide
     * ao final exiba as linguagens no console, uma abaixo da outra
     */

    public static void main(String[] args) throws ParseException {

        System.out.println("---\tordem de inserção ---");
        Set<LinguagemFavorita> linguagemFavoritas1 = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "VSCode"));
//            add(new LinguagemFavorita("Scala", 2004, "Eclipse"));
            add(new LinguagemFavorita("Kotlin", 2011, "Intellij"));
            add(new LinguagemFavorita("Java", 1995, "Intellij"));
        }};
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas1)
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println("----------------------");

        System.out.println("---\tordem natural - nome ---");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(linguagemFavoritas1);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas2)
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println("----------------------");

        System.out.println("---\tordem natural - IDE ---");
        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComparatorIde());
        linguagemFavoritas3.addAll(linguagemFavoritas1);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas3)
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println("----------------------");

        System.out.println("---\tordem natural - ano criacao / nome ---");
        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorAnoNome());
        linguagemFavoritas4.addAll(linguagemFavoritas1);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas4)
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println("----------------------");

        System.out.println("---\tordem natural - nome / ano criacao / IDE ---");
        Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemFavoritas5.addAll(linguagemFavoritas1);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas5)
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println("----------------------");

        System.out.println("---\tconjunto das liguagens ---");
        Set<LinguagemFavorita> linguagensSet = new HashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "VSCode"));
            add(new LinguagemFavorita("Java", 1995, "Eclipse"));
            add(new LinguagemFavorita("Kotlin", 2011, "Intellij"));
        }};
        System.out.println(linguagensSet);
    }

}
