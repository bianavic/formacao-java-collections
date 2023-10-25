package org.edu.fabs.map.exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ExercicioProposto2 {

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

    public static void main(String[] args) {

        Random valoresAleatorios = new Random();

        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int numero = valoresAleatorios.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.println("valor " +entry.getKey()+ " quantidade de vezes " + entry.getValue());
        }
    }

}
