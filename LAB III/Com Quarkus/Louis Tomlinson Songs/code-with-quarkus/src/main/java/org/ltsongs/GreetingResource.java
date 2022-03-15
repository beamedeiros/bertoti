package org.ltsongs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

import java.util.List;



@Path("")
public class GreetingResource {

	
	Model model = new Model();
	

	@GET
	@Path("/ltsongs")
    @Produces(MediaType.TEXT_PLAIN)
    public String ltsongs() {
        return "Hello RESTEasy and listen to Louis Tomlinson on Spotify.";
    }
	
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("louist/:disco/:ano/:tipo/")
    public Response musica2(@PathParam String disco, @PathParam String ano, @PathParam String tipo) {	
		List<LouisTomlinson> musicasEncontradas = model.buscarEspecificacao(new Especificacao(disco, ano, tipo));	
		String json = new Gson().toJson(musicasEncontradas);
    	return Response.status(200).entity(json).build();	
    }
    
    
}
