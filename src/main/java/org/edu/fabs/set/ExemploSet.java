package org.edu.fabs.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        System.out.println("crie uma lista e adicione as sete notas");


        // NAO mantem ORDEM dos elementos
        // NAO permite elementos REPETIDOS
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        // NAO permite busca por posicao
//        System.out.println("exibir a posicao da nota 5.0: " + notas.indexOf(5.0));
//        System.out.println("adicione no conjunto a nota 8.0 na posicao 4: ");
//        System.out.println("substitua a nota 5.0 pela nota 7.0: ");
//        System.out.println("exiba a terceira nota adicionada: " + notas.get(2));
//        System.out.println("remova a nota na posicao 0: ");

        System.out.println("confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("exiba a menor nota: " + Collections.min(notas));
        System.out.println("exiba a maior nota: " + Collections.max(notas));

        // OBS: pq set nao repete elementos, esta soma será menor pq nao contara com valores repetidos
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma das notas: " + soma);

        System.out.println("exiba a media das notas: " + (soma)/ notas.size());

        System.out.println("remova a nota zero: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remova as notas menores que 7 e exiba o conjunto: " );
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("exiba todas as notas na ordem na que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d); // elementos DUPLICADOS nao sao adicionados
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        // resposta: [7.0, 8.5, 9.3, 5.0, 0.0, 3.6]

        System.out.println("exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3); // notas 2, alem de ser double, o elemento contem o comparable

        System.out.println("apague todo o conjunto: ");
        notas.clear();

        System.out.println("confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }

}
