package org.edu.fabs.map.exercicio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioProposto1 {

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacao = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao);
        System.out.println("----------------------");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);
        System.out.println("----------------------");

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populacao.put("PB", 4039277);
        System.out.println(populacao);
        System.out.println("----------------------");

        System.out.println("Exiba a população do estado PE: " + populacao.get("PE"));
        System.out.println("----------------------");

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacao1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao1);
        System.out.println("----------------------");

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacao2 = new TreeMap<>(populacao);
        for (Map.Entry<String, Integer> alfabetica : populacao2.entrySet()) {
            System.out.println(alfabetica.getKey());
        }
        System.out.println("----------------------");

        Integer menorPopulacao = Collections.min(populacao.values());
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacao.entrySet()) {
            if (entry.getValue().equals(menorPopulacao))
                estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população %s e seu respectivo valor %d\n",
                estadoMenorPopulacao, Collections.min(populacao.values()));
        System.out.println("----------------------");


        Integer maiorPopulacao = Collections.max(populacao.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacao.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao))
                estadoMaiorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com a maior população %s e seu respectivo valor %d\n",
                estadoMaiorPopulacao, maiorPopulacao);
        System.out.println("----------------------");

        Iterator<Integer> iterator = populacao.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println("----------------------");

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacao.size()));
        System.out.println("----------------------");

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacao);
        System.out.println("----------------------");

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacao.clear();
        System.out.println("----------------------");

        System.out.println("Confira se a lista está vazia: " + populacao.isEmpty());
        System.out.println("----------------------");
    }

}
