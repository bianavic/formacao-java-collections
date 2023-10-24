package org.edu.fabs.list.iteracoesordenadas;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gato> {

//    private int idade;

    // int realiza as comparacoes e retorna: 0, 1, ou -1 e ordena a lista
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}
