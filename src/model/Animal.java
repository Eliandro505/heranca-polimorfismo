package model;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected  double peso;
    protected String som = "Som não definido";

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // public abstract void emitirSom();
    public abstract void emitirSom();

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}
