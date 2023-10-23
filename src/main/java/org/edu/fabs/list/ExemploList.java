package org.edu.fabs.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        // crie uma lista e adicione as sete notas
        System.out.println("crie uma lista e adicione as sete notas");


        // FORMAS DE INICIALIZAR UMA LIST:

//        List notas = new ArrayList<>();
//        List<Double> notasGenerics = new ArrayList<>();
//        ArrayList<Double> notasImplementacao = new ArrayList<>();
//        ArrayList<Double> notasParametro = new ArrayList<>(Arrays.asList(7, 8.5, 9.3, 5, 7, 0, 3.6));

//        List<Double> notas = Arrays.asList(7, 8.5, 9.3, 5, 7, 0, 3.6);
//        notas.add(10);
//        System.out.println(notas);

//        List<Double> notas = List.of(7, 8.5, 9.3, 5, 7, 0, 3.6);
//        notas.add(10);
//        System.out.println(notas);


        List<Double> notas = new ArrayList<>(); // lista criada
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        // imprimir a chamada do metodo:
            // passando a variavel
        System.out.println(notas);
            // com metodo toString
//        System.out.println(notas.toString());

        // exiba a  posicao da nota 5
        System.out.println("exibir a posicao da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("substitua a nota 5.0 pela nota 7.0: ");
        notas.set(notas.indexOf(5d), 7.0);
        System.out.println(notas);

        System.out.println("confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("exiba a terceira nota adicionada: " + notas.get(2));
        // get() passa a posicao e recebe o elemento

        System.out.println("exiba a menor nota: " + Collections.min(notas));
        // utilizando elemento min da classe Collections

        System.out.println("exiba a maior nota: " + Collections.max(notas));
        // utilizando elemento max da classe Collections

        // SOMA das notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d; // variavel de controle para colocar a soma
        while (iterator.hasNext()) {
            // colocar dentro de uma variavel
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma das notas: " + soma);


        System.out.println("exiba a media das notas: " + (soma)/notas.size()); // size retorna tipo inteiro

        // REMOVA
        System.out.println("remova a nota zero: " + notas.remove(0d));
        System.out.println(notas);

        // REMOVA
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove(); // remova o elemento de dentro da lista
        }
        System.out.println("remova as notas menores que 7 e exiba a lista: " + notas);

        System.out.println("apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("confira se a lista esta vazia: " + notas.isEmpty());

    }

}
