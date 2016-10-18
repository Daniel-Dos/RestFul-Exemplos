/**
 * {@link Path} - Essa anotação recebe uma string como parametro e indica qual é path da URL.
 * {@link GET} - Anotação que indica qual o metodo correspondente do HTTP. 
 * {@link Produces} - anotação que indica qual o mime-type do conteudo da resposta que sera enviada para o cliente.
 * {@link Consumes} - anotação que indica qual o mime-type do conteudo da requisição. Em gerla é utilizado principalmente em
 * requisições do tipo POST ou PUT.
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
		return "Olá Mundo !";
	}

}