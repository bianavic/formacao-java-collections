package org.edu.fabs.map.exercicio;

import java.util.Comparator;
import java.util.Map;

public class ComparatorContatoNome implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> nome1, Map.Entry<Integer, Contato> nome2) {
        return nome1.getValue().getNome().compareTo(nome2.getValue().getNome());
    }
}
