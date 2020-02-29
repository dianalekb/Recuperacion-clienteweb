package com.deber.rest;



import java.util.List;

import javax.ws.rs.core.GenericType;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.deber.entidad.Todos;



public class JaxRSTodos {
	
	
	//Puerto 9999 es el puerto por defecto del gateway Fabio
	String enlace= "http://127.0.0.1:9999/todos/";
	
	ResteasyClient client = new ResteasyClientBuilder().build();

	ResteasyWebTarget getTotal = client.target(enlace);
	
	
	
	
	public List<Todos> buscarTodos() {
		
		Response getListadoTotal = getTotal.request().get();
		
		return getListadoTotal.readEntity(new GenericType<List<Todos>>() {});
		}
		
		
		
		 public Todos buscar(int id) {	
			 ResteasyWebTarget getOpcion = client.target(enlace+id);
			Response getOp = getOpcion.request().get();
				return getOp.readEntity(Todos.class);
		 
		        
		    }
		 
		
	
}
