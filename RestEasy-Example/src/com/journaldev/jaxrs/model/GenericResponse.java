package com.journaldev.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

// envia resposta para o client
// XmlRootElement - converte objetos para XML

@XmlRootElement(name = "response")
public class GenericResponse {

	private boolean status;
	private String message;
	private String errorCode;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return status + "|" + message + "|" + errorCode;
	}
}
