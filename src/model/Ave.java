package model;

public class Ave extends Animal {
    private boolean podeVoar;
    private double envergaduraAsas;
    private String som;

    public Ave(String nome, int idade, double peso, boolean podeVoar, double envergaduraAsas) {
        super(nome, idade, peso);
        this.podeVoar = podeVoar;
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " piou o seguinte som: " + som);
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void voar() {
        if(podeVoar) {
            System.out.println(nome + " está voando.");
        } else {
            System.out.println(nome + " não pode voar.");
        }
    }

    @Override
    public String toString() {
        String informacoes = "Nome: " + nome + "\nIdade: " + idade + "\nPode voar? " + podeVoar + "\nEnvergadura das Asas: " + envergaduraAsas;
        return informacoes;
    }
}
