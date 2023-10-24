package org.edu.fabs.list.iteracoesordenadas.exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2 {

    /*
    Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    1. "Telefonou para a vítima?"
    2. "Esteve no local do crime?"
    3. "Mora perto da vítima?"
    4. "Devia para a vítima?"
    5. "Já trabalhou com a vítima?"
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
    "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atendendo o chamado...");

        System.out.println("Telefonou para a vítima? s/n");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime? s/n");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima? s/n");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima? s/n");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima? s/n");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        //imprimindo os dados obtidos pelo usuario
        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String contadorResposta = contador.next();
            if (contadorResposta.contains("s")) {
                count++;
            }
        }

        // se responder positivamente a 2 questões -> "Suspeita"
        // entre 3 e 4 -> "Cúmplice"
        // 5 -> "Assassina".
        // caso contrário -> "Inocente
        switch (count) {
            case 1:
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINA");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }

}
