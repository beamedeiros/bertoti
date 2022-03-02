package ltsongs;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 2030;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarMusica();

		Controller controller = new Controller(model);
		
		controller.buscarMusica();
		controller.buscarMusicaNome();
		controller.buscarMusicaDisco();
		controller.buscarMusicaAno();
		
    }
    
    public static void inicializarMusica(){
    	//singles
    	model.addMusica(new LouisTomlinson("Just Hold On", new Especificacao("Just Hold On", "2016", "Single")));
    	model.addMusica(new LouisTomlinson("Back to You", new Especificacao("Back to You", "2017", "Single")));
    	model.addMusica(new LouisTomlinson("Just Like You", new Especificacao("Just Like You", "2017", "Single")));
    	model.addMusica(new LouisTomlinson("Miss You", new Especificacao("Miss You", "2017", "Single")));
    	model.addMusica(new LouisTomlinson("Two of Us", new Especificacao("Two of Us", "2019", "Single")));
    	model.addMusica(new LouisTomlinson("Kill My Mind", new Especificacao("Kill My Mind", "2019", "Single")));
    	model.addMusica(new LouisTomlinson("We Made It", new Especificacao("We Made It", "2019", "Single")));
    	model.addMusica(new LouisTomlinson("Don't Let It Break You Heart", new Especificacao("Don't Let It Break Your Heart", "2019", "Single")));
    	model.addMusica(new LouisTomlinson("Walls", new Especificacao("Walls", "2020", "Single")));
    	
    	//album
    	model.addMusica(new LouisTomlinson("Kill My Mind", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Don't Let It Break Your Heart", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Two of Us", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("We Made It", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Too Young", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Walls", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Habit", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Always You", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Fearless", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Perfect Now", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Defenceless", new Especificacao("Walls", "2020", "Album")));
    	model.addMusica(new LouisTomlinson("Only the Brave", new Especificacao("Walls", "2020", "Album")));
    	
    	//ineditas
    	model.addMusica(new LouisTomlinson("Copy of a Copy of a Copy", new Especificacao("Sem album", "2020", "Inedita")));
    	model.addMusica(new LouisTomlinson("Change", new Especificacao("Sem album", "2021", "Inedita")));
   
    }
}
