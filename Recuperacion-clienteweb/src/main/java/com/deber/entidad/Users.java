package com.deber.entidad;

import java.io.Serializable;




public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	
	private Integer userId;
	
	
	private String title;
	
	
	private String completed;
	

public Users() {
		
	}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}





public Integer getUserId() {
	return userId;
}


public void setUserId(Integer userId) {
	this.userId = userId;
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}


public String getCompleted() {
	return completed;
}


public void setCompleted(String completed) {
	this.completed = completed;
}


@Override
public String toString() {
	return "Users [id=" + id + ", userId=" + userId + ", title=" + title + ", completed=" + completed + "]";
}
	

}
