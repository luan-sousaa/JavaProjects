package br.com.luan.pessoa;

public class Aluno {
	
	//atributos Aluno
	String nomeAluno;
	int matricula;
	int cpfAluno;
	String peridoAluno;
	String instrutorGeneroEscolhido;
	
	//metodos Aluno
	public void consultarHorario(String peridoAluno) {
		System.out.println("periodo disponivel do aluno(a) : "+peridoAluno);
	}
	
	public void escolherInstrutor(String instrutorGeneroEscolhido) {
		System.out.println("genero escolhido do instrutor(a) : "+instrutorGeneroEscolhido);
	}
	public void cadastarAluno(String nomeAluno ,int matricula, int cpfAluno ) {
		System.out.println("nome do aluno(a) : "+nomeAluno);
		System.out.println("matricula do aluno(a) : "+matricula);
		System.out.println("cpf do aluno(a) : "+cpfAluno);
		
	}

}
