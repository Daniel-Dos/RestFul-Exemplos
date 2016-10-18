package br.com.k19.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.k19.models.Banda;

/*
 * WebResources
 */

@Path("/bandas")
public class BandaResource {
	
	// Vamos utilizar um map estatico para
	//"simular " uma base de dados.
	static private Map<Integer,Banda> bandasMap;
	
	static {
		bandasMap = new HashMap<>();
		
		Banda b1 = new Banda();
		b1.setId(1);
		b1.setNome("Daniel Dias");
		b1.setAnoDeFormacao(2014);
		
		bandasMap.put(b1.getId(), b1);
		
		Banda b2 = new Banda();
		b2.setId(2);
		b2.setNome("AC/DC");
		b2.setAnoDeFormacao(2016);
		
		bandasMap.put(b2.getId(), b2);
		
		Banda b3 = new Banda();
		b3.setId(3);
		b3.setNome("Java");
		b3.setAnoDeFormacao(2019);
		
		bandasMap.put(b3.getId(), b3);
	}
	
	// Listando tudo
	@GET
	@Produces("text/xml")
	public List<Banda> getBandas() {
		return new ArrayList<>(bandasMap.values());
	}
	
	// listando uma Banda
	@Path("{id}") // As chaves indicam que são parametros
	@GET
	@Produces("text/xml")
	public Banda getBandaUnica(@PathParam("id") int id) {
		return bandasMap.get(id);
	}
	
	// Adicionando Dados
	@POST
	@Consumes("text/xml")
	@Produces("text/plain")
	public String adicionaBanda(Banda banda) {
		banda.setId(bandasMap.size() + 1);
		bandasMap.put(banda.getId(), banda);
		return banda.getNome() + " adicionado.";
	}
	
	// atualizar
	@Path("{id}")
	@PUT
	@Consumes("text/xml")
	@Produces("text/plain")
	public String atualizarBanda(Banda banda, @PathParam("id") int id) {
		Banda atual = bandasMap.get(id);
		atual.setNome(banda.getNome());
		atual.setAnoDeFormacao(banda.getAnoDeFormacao());
		return banda.getNome() + "Atualiza";
	}
	
	// deletar
	@Path("{id}")
	@DELETE
	@Produces("text/xml")
	public String deletarBanda(@PathParam("id") int id) {
		bandasMap.remove(id);
		return "Banda Removida";
	}

}
