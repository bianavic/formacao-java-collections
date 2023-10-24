package org.edu.fabs.list.iteracoesordenadas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {

    /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
    e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();

        int count = 0;

        // adicionar ate 6 temperatudas
        while (true) {
            if (count == 6) break;

            System.out.println("digite a temperatura: ");
            double temp = terminal.nextDouble();
            temperaturas.add(temp);
            count++;
        }

        System.out.println("----------------------");

        temperaturas.forEach(t -> System.out.println(t + " graus"));

        System.out.println("----------------------");

        // calculo temperatura media semestral
        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("qual a temperatura do mês " + i + ": ");
            double temp = terminal.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }
        double media = soma / temperaturas.size();
        System.out.printf("\nmédia das temperaturas: %.1f\n", media);

        System.out.println("----------------------");

        // imprimir temperaturas acima da media
        System.out.println("meses com as temperaturas acima da média");
        Iterator<Double> iterator = temperaturas.iterator();
        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case 0:
                        System.out.println("JANEIRO: " + temp + " graus");
                        break;
                    case 1:
                        System.out.println("FEVEREIRO: " + temp + " graus");
                        break;
                    case 2:
                        System.out.println("MARCO: " + temp + " graus");
                        break;
                    case 3:
                        System.out.println("ABRIL: " + temp + " graus");
                        break;
                    case 4:
                        System.out.println("MAIO: " + temp + " graus");
                        break;
                    case 5:
                        System.out.println("JUNHO: " + temp + " graus");
                        break;
                    default:
                        break;
                }
            }
            count++;
        }

    }
}