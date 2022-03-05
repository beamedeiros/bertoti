package ltsongs;

public class Especificacao {

	
	private String disco;
	private String ano;
	private String tipo;
	
	
	public Especificacao(String disco, String ano, String tipo){
		this.disco = disco;
		this.ano = ano;
		this.tipo = tipo;
	}
	
	public String getDisco(){
		return disco;
	}
	
	public String getAno(){
		return ano;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	//delegacao da comparacao de discografia, ano de lançamento e tipo das músicas para a classe Especificacao, pois ela é a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(disco.equals(esp.disco) && ano.equals(esp.ano) && tipo.equals(esp.tipo)){
			return true;
		} else {
			return false;
		}
	}
	
}
