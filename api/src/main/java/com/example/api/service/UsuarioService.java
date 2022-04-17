package com.example.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Usuario;
import com.example.api.repository.UsuarioRepository;

import java.util.List;;

@Service
public class UsuarioService {
	
	
@Autowired
private UsuarioRepository repository;

public Usuario findById(Integer id) {
Optional<Usuario> obj = repository.findById(id);
return obj.orElse(null);
}


public List<Usuario> findAll() {
return repository.findAll();
}


public Usuario update(Integer id, Usuario obj) {
Usuario newObj = findById(id);
newObj.setNome(obj.getNome());
newObj.setSobrenome(obj.getSobrenome());
newObj.setEmail(obj.getEmail());
newObj.setSenha(obj.getSenha());
return repository.save(newObj);
}


public Usuario create(Usuario obj) {
return repository.save(obj);
}


public void delete(Integer id) {
findById(id); 
repository.deleteById(id);
}


}