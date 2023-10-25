package org.edu.fabs.map.exercicio;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercicioProposto3 {

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
            System.out.println(entry.getKey());
        }
        System.out.println("----------------------");

        System.out.println("--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> minhaAgenda3 = new TreeSet<>(new ComparatorContatoNumero());
        minhaAgenda3.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : minhaAgenda3) {
            System.out.println(entry.getValue().getNumero());
        }
        System.out.println("----------------------");

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> minhaAgenda4 = new TreeSet<>(new ComparatorContatoNome());
        minhaAgenda4.addAll(minhaAgenda.entrySet());
        for (Map.Entry<Integer, Contato> contatos : minhaAgenda4) {
            System.out.println(contatos.getValue().getNome());
        }

    }

}
