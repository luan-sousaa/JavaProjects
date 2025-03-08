package br.com.luan.recursos;

public class Equipamentos {
	//Atributos
	String marca;
	String modelo;
	String categoria;
	
	
	public void usaraparelho(String marca , String modelo, String categoria) {
		System.out.println("Usando equipamento : "+categoria);
		System.out.println("Modelo : "+modelo);
		System.out.println("Marca : "+marca);
	}
	
	

}
