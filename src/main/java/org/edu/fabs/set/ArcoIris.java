package org.edu.fabs.set;

import java.util.Objects;

public class ArcoIris implements Comparable<ArcoIris> {

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public ArcoIris() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(cor, arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    // por ordem alfabetica
    @Override
    public int compareTo(ArcoIris arcoIris) {
        return this.getCor().compareTo(arcoIris.getCor());
    }

}
