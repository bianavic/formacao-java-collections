package org.edu.fabs.map.complementar;

import java.util.Comparator;

public class ComparatorDuracaoCurso implements Comparator<Curso> {

    @Override
    public int compare(Curso curso1, Curso curso2) {
        return Integer.compare(curso1.getDisciplina(), curso2.getDisciplina());
    }

}
