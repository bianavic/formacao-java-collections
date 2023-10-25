package org.edu.fabs.map.complementar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExemploComparatorMapObjetoSet {

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com o seguintes requisito:
Key: Nome do aluno e matrícula - Value: Nome das disciplinas na qual estão matriculados
*/

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Nero", 123);
        Aluno aluno2 = new Aluno("Gonzales", 125);
        Aluno aluno3 = new Aluno("Lugano", 121);

        Curso curso1 = new Curso("Java", 5);
        Curso curso2 = new Curso("Kotlin", 10);
        Curso curso3 = new Curso("Python", 8);

        Set<Curso> materia1 = new HashSet<Curso>(Arrays.asList(curso1, curso2));
        Set<Curso> materia2 = new HashSet<Curso>(Arrays.asList(curso2, curso3));
        Set<Curso> materia3 = new HashSet<Curso>(Arrays.asList(curso1, curso3));

        Map<Aluno, Set<Curso>> alunosECursos = new HashMap<Aluno, Set<Curso>>() {{
            put(aluno1, materia1);
            put(aluno2, materia2);
            put(aluno3, materia3);
        }};

        for (Map.Entry<Aluno, Set<Curso>> entry : alunosECursos.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getKey().getMatricula() + ": ");
            for (Curso entry1 : entry.getValue()) {
                System.out.println(entry1.getNome() + " ");
            }
            System.out.println();
        }

    }

}
