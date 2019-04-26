package br.com.hibernateteste;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Usuario {
@Id
public int id;
public String login;
public String senha;
public String nome;

public Usuario(int id, String login, String senha, String nome) {
	super();
	this.id = id;
	this.login = login;
	this.senha = senha;
	this.nome = nome;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


}
