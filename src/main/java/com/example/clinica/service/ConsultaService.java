package com.example.clinica.service;

import java.util.List;

import com.example.clinica.entity.Consulta;

public interface ConsultaService {
	Consulta create(Consulta a);
	Consulta update(Consulta a);
	void delete(Long id);
	Consulta read(Long id);
	List<Consulta> readAll();
	//Consulta createConsultaRol(Long ConsultaId, Long rolId); quitar las barras
}
