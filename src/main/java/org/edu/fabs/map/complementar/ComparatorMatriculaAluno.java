package org.edu.fabs.map.complementar;

import java.util.Comparator;
import java.util.Map;

public class ComparatorMatriculaAluno implements Comparator<Map.Entry<Curso, Aluno>> {

    @Override
    public int compare(Map.Entry<Curso, Aluno> aluno1, Map.Entry<Curso, Aluno> aluno2) {
        return Integer.compare(aluno1.getValue().getMatricula(), aluno2.getValue().getMatricula());
    }

}
