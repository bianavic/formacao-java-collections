package org.edu.fabs.list.iteracoesordenadas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    /*Dadas as seguintes informações sobre meus gatos, crie uma lista
    e ordene esta lista exibindo:
    (nome - idade - cor);

    Gato 1 = nome: Jon, idade: 18, cor: preto
    Gato 2 = nome: Simba, idade: 6, cor: tigrado
    Gato 3 = nome: Jon, idade: 12, cor: amarelo
    */

    public static void main(String[] args) {

        List<Gato> gatoList = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
//        System.out.println(gatoList);

        // LIST é sempre pela ORDEM DE INSERCAO
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(gatoList);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(gatoList);
        System.out.println(gatoList);

        // implementar classe COMPARABLE na classe gato
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(gatoList);
        System.out.println(gatoList);

        // COMPARATOR (pq no exercio anterior utilizei comparable para string nome,
        // é melhor utilizar outra classe para nao precisar ficar alterando no promrio compareTo())
        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(gatoList, new ComparatorIdade());
        gatoList.sort(new ComparatorIdade());
        System.out.println(gatoList);


        System.out.println("--\tOrdem cor\t---");
        Collections.sort(gatoList, new ComparatorCor());
//        gatoList.sort(new ComparatorCor());
        System.out.println(gatoList);


        // SE nomes forem iguais, o criterio de DESEMPATE sera COR, depois sera IDADE...
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        gatoList.sort(new ComparatorNomeCorIdade());
        System.out.println(gatoList);
    }

}
