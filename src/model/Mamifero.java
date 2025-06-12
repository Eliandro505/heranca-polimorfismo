package model;

public class Mamifero extends Animal {
    private String tipoPelagem;
    private boolean amamenta;
    private String som;

    public Mamifero(String nome, int idade, double peso, String tipoPelagem, boolean amamenta) {
        super(nome, idade, peso);
        this.tipoPelagem = tipoPelagem;
        this.amamenta = amamenta;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " gruniu o seguinte som: " + som);
    }

    public boolean isAmamenta() {
        return amamenta;
    }

    public void amamentar() {
        if (amamenta) {
            System.out.println(nome + " está amamentando.");
        } else {
            System.out.println(nome + " não é do tipo de animal que amamenta...");
        }
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public String toString() {
        String informacoes = "Nome: " + nome + "\nIdade: " + idade + "\nAmamenta? " + amamenta +"\nPelagem: " + tipoPelagem;
        return informacoes;
    }
}