package ltsongs;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<LouisTomlinson> musicas = new LinkedList<LouisTomlinson>();

	
	public void addMusica(LouisTomlinson musica){
		musicas.add(musica);
	}
	
	public LouisTomlinson buscarNome(String nome){
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
	
	
	public List<LouisTomlinson> buscarDisco(String disco){
		List<LouisTomlinson> musicasEncontradas = new LinkedList<LouisTomlinson>();
		for(LouisTomlinson musica:musicas) {
			if(musica.getEspc().getDisco().equals(disco)) musicasEncontradas.add(musica);
		}
		return musicasEncontradas;
	}
	
	public List<LouisTomlinson> getMusicas(){
		return musicas;
	}
	
	public List<LouisTomlinson> buscarAno(String ano){
		
		List<LouisTomlinson> musicasEncontradas = new LinkedList<LouisTomlinson>();
		for(LouisTomlinson musica:musicas) {
			if(musica.getEspc().getAno().equals(ano)) musicasEncontradas.add(musica);
		}
		return musicasEncontradas;
	}
		
	}


