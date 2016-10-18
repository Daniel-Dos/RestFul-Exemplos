package br.com.k19.models;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * CRUD em RESTFUL
 * 
 *  {@link XmlRootElement} - Ela e'fundamental para que o Jersey conhea a representa��o do objeto em XML.
 */
@XmlRootElement
public class Banda {
	
	private String nome;
	private int anoDeFormacao;
	private int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoDeFormacao() {
		return anoDeFormacao;
	}
	public void setAnoDeFormacao(int anoDeFormacao) {
		this.anoDeFormacao = anoDeFormacao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}