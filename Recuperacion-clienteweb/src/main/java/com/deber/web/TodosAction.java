package com.deber.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.deber.entidad.Todos;
import com.deber.rest.JaxRSTodos;

@Named(value = "beanTodos")
@SessionScoped
public class TodosAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Todos todos;
	private List<Todos> lista;
	
	
	private JaxRSTodos servicio = new JaxRSTodos();

	@PostConstruct
	public void iniciar() {
		todos = new Todos();
		lista = servicio.buscarTodos();
	}

	public void refresh() {
		todos = new Todos();
		lista = servicio.buscarTodos();
	}
	
	

	

	public String edit(int id) {
		todos = servicio.buscar(id);

		return "/edit.xhtml?faces-redirect=true";
	}

	public Todos getTodos() {
		return todos;
	}

	public void setTodos(Todos todos) {
		this.todos = todos;
	}

	public List<Todos> getLista() {
		return lista;
	}

	public void setLista(List<Todos> lista) {
		this.lista = lista;
	}
	
	

	
	

	

}
