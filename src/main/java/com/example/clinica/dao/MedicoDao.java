package com.example.clinica.dao;

import java.util.List;
import java.util.Optional;

import com.example.clinica.entity.Medico;

public interface MedicoDao {
	Medico create(Medico a);
	Medico update(Medico a);
	void delete(Long id);
	Optional<Medico> read(Long id);
	List<Medico> readAll();
}
