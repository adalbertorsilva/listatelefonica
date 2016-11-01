package br.org.silva.listatelefonica.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.org.silva.listatelefonica.dao.ContatoDao;
import br.org.silva.listatelefonica.interfaces.UTF8MediaType;
import br.org.silva.listatelefonica.model.Contato;

@Path("contatos")
public class ContatoService {
	
	@Autowired
	private ContatoDao contatoDao;

	@GET
	@Produces(UTF8MediaType.JSON)
	public Response getContacts(){
		
	return	Response.ok()
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
					.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With")
					.status(200).entity(contatoDao.getContacts()).build();
					   
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Transactional
	public Response save(Contato contato){
		contatoDao.save(contato);
		return Response.ok()
				.header("Access-Control-Allow-Origin", "http://localhost:8080/listatelefonica/contatos")
				.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With")
				.status(200).entity("Operação realizaada com sucesso !").build();
	}

}
