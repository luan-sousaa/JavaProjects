package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    String intesidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Calcula_imc(double altura, double peso){
        this.peso = peso;
        this.altura = altura;
        double imc = peso / (altura * altura);
        System.out.println("IMC Pessoa : " + imc);
        return imc;
    }

    public boolean Intensidade_esporte(boolean intesidade){
        System.out.println("Você pratica esporte com intensidade elevada : " + intesidade);
        return intesidade;
    }

}
