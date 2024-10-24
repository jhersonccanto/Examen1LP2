package com.example.clinica.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.clinica.dao.ConsultaDao;
import com.example.clinica.entity.Consulta;
import com.example.clinica.repository.ConsultaRepository;


@Component
public class ConsultaDaoImpl implements ConsultaDao{
	@Autowired
	private ConsultaRepository repository;

	@Override
	public Consulta create(Consulta a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Consulta update(Consulta a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Consulta> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Consulta> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	

}
