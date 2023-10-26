package org.edu.fabs.streamapi;

import org.edu.fabs.map.exercicio.Contato;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {

    // REFATORANDO o exercicio proposto 3 da aula sobre maps

/*Dadas as seguintes informações de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> minhaAgenda = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(minhaAgenda);
        System.out.println("----------------------");

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> minhaAgenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(minhaAgenda1);
        System.out.println("----------------------");

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> minhaAgenda2 = new TreeMap<>(minhaAgenda);
        for (Map.Entry<Integer, Contato> entry : minhaAgenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        System.out.println("----------------------");

        System.out.println("### CLASSE ANONIMA ###");
        System.out.println("--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> minhaAgenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
            }
        });
        minhaAgenda3.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : minhaAgenda3) {
            System.out.println(entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        System.out.println("----------------------");
        System.out.println("### INTERFACE FUNCIONAL ###");
        Set<Map.Entry<Integer, Contato>> minhaAgenda4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> contato) {
                return contato.getValue().getNumero();
            }
        }));
        minhaAgenda4.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : minhaAgenda4) {
            System.out.println(entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        System.out.println("----------------------");
        System.out.println("### LAMBDA ###"); // argumento -> corpo
        Set<Map.Entry<Integer, Contato>> minhaAgenda5 = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Contato>, Integer>() {
//            @Override
//            public Integer apply(Map.Entry<Integer, Contato>
                                         contato ->
//                ) { return
                contato.getValue().getNumero()));
//            }
//        }));
        minhaAgenda5.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : minhaAgenda5) {
            System.out.println(entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        System.out.println("----------------------");


        System.out.println("### CLASSE ANONIMA ###");
        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> minhaAgenda7 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> nome1, Map.Entry<Integer, Contato> nome2) {
                return nome1.getValue().getNome().compareTo(nome2.getValue().getNome());
            }
        });
        minhaAgenda7.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> contatos : minhaAgenda7) {
            System.out.println(contatos.getValue().getNome());
        }

        System.out.println("----------------------");
        System.out.println("### INTERFACE FUNCIONAL ###");
        Set<Map.Entry<Integer, Contato>> minhaAgenda8 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato> nome) {
                return nome.getValue().getNome();
            }
        }));
        minhaAgenda8.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> contatos : minhaAgenda8) {
            System.out.println(contatos.getValue().getNome());
        }

        System.out.println("----------------------");
        System.out.println("### LAMBDA ###");
        Set<Map.Entry<Integer, Contato>> minhaAgenda9 = new TreeSet<>(Comparator.comparing(
                 nome -> nome.getValue().getNome()));
        minhaAgenda9.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> contatos : minhaAgenda9) {
            System.out.println(contatos.getValue().getNome());
        }
    }

}

//class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
//    @Override
//    public int compare(Map.Entry<Integer, Contato> numero1, Map.Entry<Integer, Contato> numero2) {
//        return Integer.compare(numero1.getValue().getNumero(), numero2.getValue().getNumero());
//    }
//}

//class ComparatorOrdemNome implements Comparator<Map.Entry<Integer, Contato>> {
//    @Override
//    public int compare(Map.Entry<Integer, Contato> nome1, Map.Entry<Integer, Contato> nome2) {
//        return nome1.getValue().getNome().compareTo(nome2.getValue().getNome());
//    }
//}
