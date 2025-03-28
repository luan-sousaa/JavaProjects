package main;

import pessoa.Atleta;
import pessoa.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.Calcula_imc(1.70, 50);

        Atleta at1 = new Atleta();
        at1.Calcula_imc(1.70, 50);
        at1.Esporte_praticado("volei");

    }
}
