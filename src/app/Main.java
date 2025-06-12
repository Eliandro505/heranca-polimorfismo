package app;

import model.Animal;
import model.Ave;
import model.Mamifero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ave abutreVermelho = new Ave("Abutre-de-cabeça-vermelha", 3, 3.5, true, 2.6);
        Mamifero porco = new Mamifero("Porco Doméstico", 13, 323, "Pelagem lanosa", true);

        List<Animal> listaAnimal = new ArrayList<Animal>(20);
        listaAnimal.add(abutreVermelho);
        listaAnimal.add(porco);

        porco.setSom("PALLLMEEEEIIIRASSS");
        abutreVermelho.setSom("Cruu Cruu Cruu");



        System.out.println(abutreVermelho);
        System.out.println();

        System.out.println(porco);
        System.out.println();

        abutreVermelho.emitirSom();
        porco.emitirSom();
    }
}
