package com.example.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.MovimentacaoUsuario;
import com.example.api.model.Usuario;
import com.example.api.repository.MovimentacaoUsuarioRepository;


import java.util.List;


@Service
public class MovimentacaoUsuarioService {

	@Autowired
	private MovimentacaoUsuarioRepository repository;
	
	
	
	
public MovimentacaoUsuario findById(Integer id) {
	Optional<MovimentacaoUsuario> obj = repository.findById(id);
	return obj.orElse(null);
		}
	


public List<MovimentacaoUsuario> findAll() {
return repository.findAll();
}



public MovimentacaoUsuario update(Integer id, MovimentacaoUsuario obj) {
	
	MovimentacaoUsuario newObj = findById(id);
	newObj.setCartao(obj.getCartao());
	newObj.setValor(obj.getValor());
	
	return repository.save(newObj);
}



public MovimentacaoUsuario create(MovimentacaoUsuario obj) {
return repository.save(obj);
}


public void delete(Integer id) {
findById(id); 
repository.deleteById(id);
}



	
}
