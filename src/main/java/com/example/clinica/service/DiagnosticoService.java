package com.example.clinica.service;

import java.util.List;

import com.example.clinica.entity.Diagnostico;

public interface DiagnosticoService {
	Diagnostico create(Diagnostico a);
	Diagnostico update(Diagnostico a);
	void delete(Long id);
	Diagnostico read(Long id);
	List<Diagnostico> readAll();
}
