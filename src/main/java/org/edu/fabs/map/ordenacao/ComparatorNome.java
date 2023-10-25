package org.edu.fabs.map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getTitulo().compareTo(livro2.getValue().getTitulo());
    }

}
