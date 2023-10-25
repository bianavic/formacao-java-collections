package org.edu.fabs.map.complementar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploComparatorMapObjetoObjeto {

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
*/

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Nero", 123);
        Aluno aluno2 = new Aluno("Gonzales", 125);
        Aluno aluno3 = new Aluno("Lugano", 121);

        Curso curso1 = new Curso("Java", 5);
        Curso curso2 = new Curso("Kotlin", 10);
        Curso curso3 = new Curso("Python", 8);

        Map<Curso, Aluno> cursos = new HashMap<>() {{
            put(curso1, aluno1);
            put(curso2, aluno2);
            put(curso3, aluno3);
        }};

        System.out.println("Exibindo Dicionário:");
        for (Map.Entry<Curso, Aluno> entry : cursos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-------\n" + "Nome Disciplina:");
        Map<Curso, Aluno> meusCursos1 = new TreeMap<Curso, Aluno>(cursos);
        for (Map.Entry<Curso, Aluno> entry : meusCursos1.entrySet()) {
            System.out.println(entry.getKey().getNome());
        }

        System.out.println("-------\n" + "Duração Disciplina:");
        Map<Curso, Aluno> meusCursos2 = new TreeMap<Curso, Aluno>(new ComparatorDuracaoCurso());
        for (Map.Entry<Curso, Aluno> entry : meusCursos2.entrySet()) {
            System.out.println(entry.getKey().getDisciplina());
        }

        System.out.println("-------\n" + "Nome do Aluno:");
        Set<Map.Entry<Curso, Aluno>> meusCursos3 = new TreeSet<Map.Entry<Curso, Aluno>>(new ComparatorNomeAluno());
        meusCursos3.addAll(cursos.entrySet());
        for (Map.Entry<Curso, Aluno> entry : meusCursos3) {
            System.out.println(entry.getValue().getNome());
        }
        System.out.println("-------\n" + "Matricula do Aluno:");
        Set<Map.Entry<Curso, Aluno>> meusCursos4 = new TreeSet<Map.Entry<Curso, Aluno>>(new ComparatorMatriculaAluno());
        meusCursos4.addAll(cursos.entrySet());
        for (Map.Entry<Curso, Aluno> entry : meusCursos4) {
            System.out.println(entry.getValue().getMatricula());
        }
    }

}
