/**
 * {@link Path} - Essa anota��o recebe uma string como parametro e indica qual � path da URL.
 * {@link GET} - Anota��o que indica qual o metodo correspondente do HTTP. 
 * {@link Produces} - anota��o que indica qual o mime-type do conteudo da resposta que sera enviada para o cliente.
 * {@link Consumes} - anota��o que indica qual o mime-type do conteudo da requisi��o. Em gerla � utilizado principalmente em
 * requisi��es do tipo POST ou PUT.
 */
package com.k19.restful.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorldResource {
	@GET
	@Produces("text/plain")
	public String showHelloWorld() {
		return "Ol� Mundo !";
	}

}