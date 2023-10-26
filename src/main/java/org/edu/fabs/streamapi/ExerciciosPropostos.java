package org.edu.fabs.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosPropostos {

    /**
     * Dada uma lista de stream de numeros aleatorios: "1", "0", "4", "1", "2", "3", "9", "9", "6", "5"
     * 1. "Ignore os 3 primeiros elementos da lista e imprima o restante"
     * 2. "Retirando os números repetidos da lista, quantos números ficam?"
     * 3. "Mostre o maior valor da lista"
     * 4. "Pegue apenas os números pares e some"
     * 5. "Mostre a lista na ordem númerica"
     * 6. "Agrupe os valores ímpares múltiplos de 3 ou de 5"
     */

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        long count = numerosAleatorios.stream()
                .distinct().count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + count);

        System.out.print("Mostre o maior valor da lista: ");
        Stream<Integer> integerStream = numerosAleatorios.stream()
                .map(Integer::parseInt);
        integerStream.mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        // lista com numeros inteiros
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = numerosAleatoriosInteger.stream()
                .filter(integer -> (integer % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + sum);

        System.out.println("Mostre a lista na ordem númerica: ");
        Set<String> numerosOrdemNatural = numerosAleatorios.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> numerosMultiplos3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(numerosMultiplos3E5);

    }

}
