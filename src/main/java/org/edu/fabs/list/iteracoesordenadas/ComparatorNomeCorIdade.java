package org.edu.fabs.list.iteracoesordenadas;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {

        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome; // diferente de 0, significa nomes sao diferentes

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor; // diferente de 0, significa ncores sao diferentes

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}
