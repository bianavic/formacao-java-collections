package org.edu.fabs.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStreamApi {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        // com argumento
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // simplificado com lambda
//        numerosAleatorios.forEach(s -> System.out.println(s));

        System.out.println("### METHOD REFERENCE ###");
        numerosAleatorios.forEach(System.out::println);


        System.out.println("----------------------");

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        // OBS: o Set nao aceita numeros repetidos
        // coletando elementos para passar para outro lugar
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        // obs: transformar != do coletar do exemplo anterior
//        numerosAleatorios.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
        // refatorado
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();
        collectList.forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        // 1- para trabalhar com nuneros, transforme em lista de Integers
        // 2- selecione -> filtre
        // 3 - funcao Predicate
//        List<Integer> collect = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        if (integer % 2 == 0 && integer > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());
        // refatorado
        List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> (integer % 2 == 0 && integer > 2))
                .toList();
        System.out.println(listaParesMaioresQue2);
        System.out.println("----------------------");

        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios.stream()
//                // mapToInt -> pegar cada elemento para manipular
//                .mapToInt(new ToIntFunction<String>() {
//                    @Override
//                    public int applyAsInt(String s) {
//                        // pegar cada string s para transformar em um Int
//                        return Integer.parseInt(s);
//                    }
//                });
        // refatoracao 1
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average() // OptionalDouble
//                .ifPresent(new DoubleConsumer() {
//                    @Override
//                    public void accept(double v) {
//                        System.out.println(v);
//                    }
//                });
        // refatoracao 2
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        System.out.println("----------------------");

        System.out.println("Remova os valores ímpares: ");
        // transformar para int
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // obs: removeIf() nao é stream, é um metodo de List
//        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if (integer % 2 != 0) return true;
//                return false;
//            }
//        });
        // refatoracao
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
        System.out.println("----------------------");

        //        Para você
//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
//        System.out.print("Mostre o maior valor da lista: ");
//        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);
//        System.out.println("Mostre a lista na ordem númerica: ");
//        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

    }

}
