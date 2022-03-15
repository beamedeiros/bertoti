package org.ltsongs;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<LouisTomlinson> musicas = new LinkedList<LouisTomlinson>();

	public Model() {
		//singles
    	addMusica(new LouisTomlinson("Just Hold On", new Especificacao("Just Hold On", "2016", "Single")));
    	addMusica(new LouisTomlinson("Back to You", new Especificacao("Back to You", "2017", "Single")));
    	addMusica(new LouisTomlinson("Just Like You", new Especificacao("Just Like You", "2017", "Single")));
    	addMusica(new LouisTomlinson("Miss You", new Especificacao("Miss You", "2017", "Single")));
    	addMusica(new LouisTomlinson("Two of Us", new Especificacao("Two of Us", "2019", "Single")));
    	addMusica(new LouisTomlinson("Kill My Mind", new Especificacao("Kill My Mind", "2019", "Single")));
    	addMusica(new LouisTomlinson("We Made It", new Especificacao("We Made It", "2019", "Single")));
    	addMusica(new LouisTomlinson("Don't Let It Break You Heart", new Especificacao("Don't Let It Break Your Heart", "2019", "Single")));
    	addMusica(new LouisTomlinson("Walls", new Especificacao("Walls", "2020", "Single")));
    	
    	//album
    	addMusica(new LouisTomlinson("Kill My Mind", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Don't Let It Break Your Heart", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Two of Us", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("We Made It", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Too Young", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Walls", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Habit", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Always You", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Fearless", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Perfect Now", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Defenceless", new Especificacao("Walls", "2020", "Album")));
    	addMusica(new LouisTomlinson("Only the Brave", new Especificacao("Walls", "2020", "Album")));
    	
    	//ineditas
    	addMusica(new LouisTomlinson("Copy of a Copy of a Copy", new Especificacao("Sem album", "2020", "Inedita")));
    	addMusica(new LouisTomlinson("Change", new Especificacao("Sem album", "2021", "Inedita")));
   
	}
	
	public void addMusica(LouisTomlinson musica){
		musicas.add(musica);
	}
	
	public LouisTomlinson buscarMusica(String nome){
		for(LouisTomlinson musica:musicas){
			if(musica.getNome().equals(nome)) return musica;
		}
		
		return null;
	}
	
	
	public List<LouisTomlinson> buscarEspecificacao(Especificacao esp){
		List<LouisTomlinson> musicasEncontradas = new LinkedList<LouisTomlinson>();
		
		for(LouisTomlinson musica:musicas){
			 if(esp.comparar(musica.getEspc())) musicasEncontradas.add(musica);
		}
		
		return musicasEncontradas;
		
	}
}