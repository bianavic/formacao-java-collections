package org.edu.fabs.map.ordenacao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

    public static void main(String[] args) {

        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Chimamanda Ngozi Adichie", new Livro("Americanah", 520));
            put("W. Somerset Maugham", new Livro("The Razor's Edge", 314));
            put("Fiódor Dostoiévski", new Livro("Os Irmãos Karamázov", 1040));
        }};

        System.out.println("--\tOrdem aleatória - por autor e titulo \t--");

        // entrySet() -> metodo trabalhar com elementos separadamente
        for (Map.Entry<String, Livro> livroEntry : meusLivros.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue());
        }

        System.out.println("--\tOrdem insercao\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Chimamanda Ngozi Adichie", new Livro("Americanah", 520));
            put("W. Somerset Maugham", new Livro("The Razor's Edge", 314));
            put("Fiódor Dostoiévski", new Livro("Os Irmãos Karamázov", 1040));
        }};
        for (Map.Entry<String, Livro> livroEntry : meusLivros1.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue());
        }

        // de acordo com as chaves
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livroEntry : meusLivros2.entrySet()) {
            System.out.println(livroEntry.getKey());
        }

        // de acordo com os valores
        // precisa do comparator
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livroEntry : meusLivros3) {
            System.out.println(livroEntry.getValue().getTitulo());
        }

        System.out.println("--\tOrdem por numero de pagina\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros4) {
            System.out.println(livros.getValue().getPaginas());
        }
    }

}
