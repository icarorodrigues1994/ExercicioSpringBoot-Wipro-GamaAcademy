package com.example.api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.api.model.MovimentacaoUsuario;
import com.example.api.service.MovimentacaoUsuarioService;

@RestController
@RequestMapping("/movimentacaoUsuarios")
@CrossOrigin("*")

public class MovimentacaoUsuarioController {
	
	
	@Autowired
	private MovimentacaoUsuarioService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<MovimentacaoUsuario> GetById(@PathVariable Integer id) { // variavel presente na uri
		
			MovimentacaoUsuario obj = this.service.findById(id);
			return ResponseEntity.ok().body(obj);
	}
	
	
	@GetMapping
	public ResponseEntity<List<MovimentacaoUsuario>> GetAll() {
		
		List<MovimentacaoUsuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@PostMapping
		public ResponseEntity<MovimentacaoUsuario> Post(@RequestBody MovimentacaoUsuario MovimentacaoUsuario) {
		
		MovimentacaoUsuario newObj = service.create(MovimentacaoUsuario);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
			return ResponseEntity.status(HttpStatus.GONE).body(service.create(MovimentacaoUsuario));
	// return ResponseEntity.created(uri).build();
	}
	
	
	@PutMapping("/{id}")
		public ResponseEntity<MovimentacaoUsuario> Put(@PathVariable Integer id, @RequestBody MovimentacaoUsuario obj) {
			
			MovimentacaoUsuario newMovimentacaoUsuario = service.update(id, obj);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(newMovimentacaoUsuario);
	}

	
	
	@DeleteMapping("/{id}")
		public ResponseEntity<Void> Delete(@PathVariable Integer id) {
		
			service.delete(id);
			return ResponseEntity.noContent().build();
	}
	
	


}
