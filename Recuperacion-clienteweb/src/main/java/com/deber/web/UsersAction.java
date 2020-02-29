package com.deber.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.deber.entidad.Users;
import com.deber.rest.JaxRSUsers;

@Named(value = "beanUsers")
@SessionScoped
public class UsersAction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Users users;
	private List<Users> lista;
	
	private JaxRSUsers servicio = new JaxRSUsers();

	@PostConstruct
	public void iniciar() {
		users = new Users();
		lista = servicio.buscarTodos();
	}

	public void refresh() {
		users = new Users();
		lista = servicio.buscarTodos();
	}
	
	

	

	public String edit(int id) {
		users = servicio.buscar(id);

		return "/edit2.xhtml?faces-redirect=true";
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Users> getLista() {
		return lista;
	}

	public void setLista(List<Users> lista) {
		this.lista = lista;
	}

	
	
}
