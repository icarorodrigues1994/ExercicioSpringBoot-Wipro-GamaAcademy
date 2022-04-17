package com.example.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
String nome;
String email;
String senha;
String sobrenome;
String cartao;

public Usuario() {
super();
}


public Usuario(String nome, String email, String senha, String sobrenome, String cartao) 
{
super();
this.nome = nome;
this.email = email;
this.senha = senha;
this.sobrenome = sobrenome;
this.cartao = cartao;
}


public String getNome() {
	return nome;
}


public Integer getId() {
	return id;
}


public String getCartao() {
	return cartao;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getSenha() {
	return senha;
}


public void setSenha(String senha) {
	this.senha = senha;
}


public String getSobrenome() {
	return sobrenome;
}


public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}


@Override
public int hashCode() {
	return Objects.hash(cartao, email, id, nome, senha, sobrenome);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Usuario other = (Usuario) obj;
	return Objects.equals(cartao, other.cartao) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
			&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
			&& Objects.equals(sobrenome, other.sobrenome);
}


}