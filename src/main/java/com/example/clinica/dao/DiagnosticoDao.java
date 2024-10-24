package com.example.clinica.dao;

import java.util.List;
import java.util.Optional;

import com.example.clinica.entity.Diagnostico;

public interface DiagnosticoDao {
	Diagnostico create(Diagnostico a);
	Diagnostico update(Diagnostico a);
	void delete(Long id);
	Optional<Diagnostico> read(Long id);
	List<Diagnostico> readAll();
}
