package com.example.clinica.service;

import java.util.List;

import com.example.clinica.entity.Paciente;

public interface PacienteService {
	Paciente create(Paciente a);
	Paciente update(Paciente a);
	void delete(Long id);
	Paciente read(Long id);
	List<Paciente> readAll();
}
