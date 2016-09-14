package it.nicolaamatucci.ormlite.example;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@DatabaseField(columnName = "id", generatedId = true, canBeNull = false)
	private Integer id;
	
	@DatabaseField(columnName = "name")
	private String name;
	
	@DatabaseField(columnName = "surname")
	private String surname;
	
	@DatabaseField(columnName = "password")
	private String password;
	
	@DatabaseField(columnName = "email")
	private String email;
	
	@DatabaseField(columnName = "enabled")
	private boolean enabled;
	
	public User() {
		super();
	}

	public User(Integer id, String name, String surname, String password, String email, boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}

