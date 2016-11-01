package br.org.silva.listatelefonica.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import br.org.silva.listatelefonica.dao.OperaoraDao;
import br.org.silva.listatelefonica.interfaces.UTF8MediaType;

@Path("operadoras")
public class OperadoraService {
	
	@Autowired
	private OperaoraDao operadoraDao;
	
	@GET
	@Produces(UTF8MediaType.JSON)
	public Response getOperadoras(){
		return Response.ok().status(200).entity(operadoraDao.getOperadoras()).build();
	}

}
