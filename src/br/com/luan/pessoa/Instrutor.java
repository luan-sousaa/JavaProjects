package br.com.luan.pessoa;

public class Instrutor {
	// atributos instrutor
	String nomeInstrutor;
	String disponibilidadeInstrutor;
	int matriculaInstrutor;
	String generoInstrutor;
	// metodos instrutor

	public void cadastrarInstrutor(String nomeInstrutor, int matriculaInstrutor , String genero) {
		System.out.println("nome do Instrutor(a) : " +nomeInstrutor);
		System.out.println("matricula do Instrutor(a) : "+matriculaInstrutor);
		System.out.println("genero do Instrutor(a) : "+genero);
	}
	
	public void disponibilidadeInstrutor(String disponibilidadeInstrutor) {
		System.out.println("disponibilidade do Instrutor(a) : "+disponibilidadeInstrutor);
		
	}

}
