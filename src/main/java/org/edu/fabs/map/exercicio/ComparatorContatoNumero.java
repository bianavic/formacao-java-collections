package org.edu.fabs.map.exercicio;

import java.util.Comparator;
import java.util.Map;

public class ComparatorContatoNumero implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> numero1, Map.Entry<Integer, Contato> numero2) {
        return Integer.compare(numero1.getValue().getNumero(), numero2.getValue().getNumero());
    }

}
