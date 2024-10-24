package com.example.clinica.dao;

import java.util.List;
import java.util.Optional;

import com.example.clinica.entity.Especialidad;

public interface EspecialidadDao {
	Especialidad create(Especialidad a);
	Especialidad update(Especialidad a);
	void delete(Long id);
	Optional<Especialidad> read(Long id);
	List<Especialidad> readAll();
}
