package org.edu.fabs.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdecacaoSet {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t---");
        Set<Serie> minhasSeries = new HashSet<>() {{
           add(new Serie("cold case", "policial", 60));
            add(new Serie("criminal minds", "criminal", 120));
            add(new Serie("boston legal", "drama", 120));
        }};
        for (Serie serie : minhasSeries)
        System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem de Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("cold case", "policial", 60));
            add(new Serie("criminal minds", "criminal", 120));
            add(new Serie("boston legal", "drama", 120));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        // NAO permite objetos REPETIDOS, set nao recebe objetos iguais
        // criar criterio de DESEMPATE
        System.out.println("--\tOrdem Natural (TempoEpisódio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        // é melhor utilizar outra classe para nao precisar ficar alterando no proprio compareTo())
        System.out.println("--\tOrdem Genero\t---");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem Tempo de Episódio\t---");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

}
