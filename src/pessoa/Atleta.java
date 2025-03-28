package pessoa;

public class Atleta extends Pessoa {
    String esporte;

    public void Esporte_praticado(String esporte) {
        System.out.println("Esporte praticado : " + esporte);
    }

    @Override
    public double Calcula_imc(double altura, double peso) {

        getAltura();
        getPeso();
        double imc = peso / (altura * altura);
        System.out.println("IMC Do Atleta: " + imc * 0.95);
        return imc;
    }
}