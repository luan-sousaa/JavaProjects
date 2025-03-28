package main;

import pessoa.Atleta;
import pessoa.Pessoa;

public class Main {


    public static void main(String[] args) {
        //criar um comportamento que difere um atleta de uma pessoa normal
        Pessoa p1 = new Pessoa();

        Atleta at1 = new Atleta();

        if (at1.Intensidade_esporte(false)){
            at1.Calcula_imc(1.70, 50);
            at1.Esporte_praticado("volei");
        }else {
            p1.Calcula_imc(1.70, 50);
        }


    }
}
