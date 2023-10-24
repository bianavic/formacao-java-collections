package org.edu.fabs.list.iteracoesordenadas;

public class Gato implements Comparable<Gato> {

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    /**
     * OBS:
     * o metodo retorna int, no entando estou comparando string nome
     * a propria String possui o metodo chamado compareToIgnoreCase q possibilita retornar int
     *     // se ZERO = nomes iguais
     *     // se 1 = gato q estou comparando é maior (precisa ficar depois) que o gato comparado
     *     // se -1 = gato q estou comparando é menor q o gato comparado
     * @param gato
     * @return
     */
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}