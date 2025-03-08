package br.com.luan.main;
import br.com.luan.pessoa.*;
import br.com.luan.recursos.*;

public class Main {
	public static void main(String[] args) {
		Aluno objpessoa = new Aluno();
		System.out.println("ALUNO(a)");
		objpessoa.cadastarAluno("luan", 4541,45454785);
		objpessoa.consultarHorario("matutino");
		objpessoa.escolherInstrutor("femenino");
		
		System.out.println();
		System.out.println("INSTRUTOR DISPONIVEL");
		
		Instrutor objinstrutor = new Instrutor();
		objinstrutor.cadastrarInstrutor("joao", 04544, "masculino");
		objinstrutor.disponibilidadeInstrutor("noturno");
		
		System.out.println();
		System.out.println("EQUIPAMENTO EM USO");
		
		Equipamentos objequipamentos = new Equipamentos();
		objequipamentos.usaraparelho("fit horse", "legpress", "musculação");
		
		System.out.println();
		System.out.println("AULAS DISPONIVEIS");
		Aulas objAula = new Aulas();
		objAula.assistirAula("zumba", "Noturno", 7);	
		
		
	}

}
