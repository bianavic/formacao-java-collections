package org.edu.fabs.set.exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto1 {

    public static void main(String[] args) {

        System.out.println("exiba todas as cores uma abaixo da outra");
        Set<String> cores = new HashSet<>(Arrays.asList("verde", "amarelo", "vermelho", "laranja", "azul", "violeta", "anil"));
        cores.forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("exiba a quantidade de cores");
        System.out.println(cores.size());
        System.out.println("----------------------");

        System.out.println("exiba as cores em ordem alfabetica");
        Set<String> nome = new TreeSet<>(cores);
        System.out.println(nome);
        System.out.println("----------------------");

        System.out.println("exiba as cores na ordem inversa qda que foi informada"); // passar o ser + metodo q faz a reversao (com classe collections)
        Set<String> cores3 = new LinkedHashSet<>(Arrays.asList("verde", "amarelo", "vermelho", "laranja", "azul", "violeta", "anil"));
        System.out.println(cores3);
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);
        System.out.println("----------------------");

        System.out.println("exiba todas as cores que comecam com a letra V");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(cores);
        System.out.println("----------------------");

        Set<String> cores2 = new HashSet<>(Arrays.asList("verde", "amarelo", "vermelho", "laranja", "azul", "violeta", "anil"));
        System.out.println("remova todas as cores que NAO comecam com a letra V");
        Iterator<String> iterator2 = cores2.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(cores2);
        System.out.println("----------------------");

        System.out.println("limpe o conjunto");
        cores.clear();
        System.out.println("----------------------");

        System.out.println("confira se o conjunto esta vazio");
        System.out.println(cores);

    }

}
