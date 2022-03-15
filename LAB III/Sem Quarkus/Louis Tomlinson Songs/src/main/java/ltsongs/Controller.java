package ltsongs;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarMusica(){
		get("/louist/:disco/:ano/:tipo", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":disco"), req.params(":ano"), req.params(":tipo"));	
			List<LouisTomlinson> musicasEncontradas = model.buscarEspecificacao(espec);	
			return new Gson().toJson(musicasEncontradas);
			
		});
	}
	
	
	public void buscarMusicaNome(){
		get("/louist/:nome", (req, res) -> {
		
			
			LouisTomlinson musicaEncontrada = model.buscarNome(req.params(":nome"));	
			return new Gson().toJson(musicaEncontrada);
			
		});
	}
	
	public void buscarMusicaDisco(){
		get("/louist/disco/:disco", (req, res) -> {
		
			
			List<LouisTomlinson> musicaEncontrada = model.buscarDisco(req.params(":disco"));	
			return new Gson().toJson(musicaEncontrada);
			
		});
	}
	
	public void buscarMusicaAno(){		
			get("/louist/ano/:ano", (req, res) -> {
		
			
			List<LouisTomlinson> musicaEncontrada = model.buscarAno(req.params(":ano"));	
			return new Gson().toJson(musicaEncontrada);
			
		});
		
	}
	
	

}
