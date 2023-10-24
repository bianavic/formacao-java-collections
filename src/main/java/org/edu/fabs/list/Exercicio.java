package org.edu.fabs.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {

        // resolva os exercicios utilizando os metodos da implementacao LinkedList

        // crie uma lista chamada notas2

//        List<Double> notas2 = new ArrayList<>(); // lista criada
//        notas2.add(7.0);
//        notas2.add(8.5);
//        notas2.add(9.3);
//        notas2.add(5d);
//        notas2.add(7d);
//        notas2.add(0d);
//        notas2.add(3.6);

        LinkedList<Double> notas2 = new LinkedList<>(); // lista criada
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos da list ArrayList nessa nova lista: " + notas2);

        System.out.println("mostre a primeira nota da nova lista sem remove-lo: " + notas2.getFirst());

        System.out.println("mostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.getFirst());
        notas2.removeFirst();
        System.out.println(notas2);

    }


}
