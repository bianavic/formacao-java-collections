package org.edu.fabs.map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
    }
}
