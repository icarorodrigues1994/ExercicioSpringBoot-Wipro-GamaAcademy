package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.MovimentacaoUsuario;


@Repository
public interface MovimentacaoUsuarioRepository extends JpaRepository<MovimentacaoUsuario, Integer>{

}
