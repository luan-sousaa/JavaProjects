package br.com.luan.recursos;

public class Aulas {
	String tipoAula;
	String turno;
	int sala;
	
	
	public void assistirAula(String tipoAula,String turno , int sala) {
		System.out.println("Aula de : "+tipoAula);
		System.out.println("turno da aula : "+turno);
		System.out.println("Sala : "+sala);
	}
}
