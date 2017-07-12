package com.github.otavioaraujo.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.otavioaraujo.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
