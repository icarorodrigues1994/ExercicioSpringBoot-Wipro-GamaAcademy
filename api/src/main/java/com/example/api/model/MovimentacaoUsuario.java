package com.example.api.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovimentacaoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Double valor;
	String cartao;
	
	
	
public MovimentacaoUsuario() {
		super();
}



public MovimentacaoUsuario(Double valor, String cartao) {
	super();
	this.valor = valor;
	this.cartao = cartao;
}



public double getValor() {
	return valor;
}



public void setValor(double valor) {
	this.valor = valor;
}



public String getCartao() {
	return cartao;
}



public void setCartao(String cartao) {
	this.cartao = cartao;
}



public Integer getId() {
	return id;
}


	
}




