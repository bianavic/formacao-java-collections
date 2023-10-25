package org.edu.fabs.map.complementar;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeAluno implements Comparator<Map.Entry<Curso, Aluno>> {

    @Override
    public int compare(Map.Entry<Curso, Aluno> aluno1, Map.Entry<Curso, Aluno> aluno2) {
        return aluno1.getKey().getNome().compareTo(aluno2.getKey().getNome());
    }

}
