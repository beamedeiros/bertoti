package org.ltsongs;

public class LouisTomlinson {

	private String nome;
	private Especificacao espc;
	
	
	public LouisTomlinson(String nome, Especificacao espc){
		this.nome = nome;
		this.espc = espc;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
