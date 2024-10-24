package com.example.clinica.service;

import java.util.List;

import com.example.clinica.entity.Medico;

public interface MedicoService {
	Medico create(Medico a);
	Medico update(Medico a);
	void delete(Long id);
	Medico read(Long id);
	List<Medico> readAll();
}
