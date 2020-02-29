package com.deber.entidad;

import java.io.Serializable;




public class Company implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	
	private String name;
	
	
	private String catchPhrase;
	
	
	private String bs;

public Company() {
		
	}
	
	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCatchPhrase() {
		return catchPhrase;
	}

	
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	
	public String getBs() {
		return bs;
	}

	
	public void setBs(String bs) {
		this.bs = bs;
	}

}
