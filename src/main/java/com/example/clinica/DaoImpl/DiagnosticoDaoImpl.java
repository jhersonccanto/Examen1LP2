package com.example.clinica.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.clinica.dao.DiagnosticoDao;
import com.example.clinica.entity.Diagnostico;
import com.example.clinica.repository.DiagnosticoRepository;

@Component
public class DiagnosticoDaoImpl implements DiagnosticoDao {
	@Autowired
	private DiagnosticoRepository repository;

	@Override
	public Diagnostico create(Diagnostico a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Diagnostico update(Diagnostico a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Diagnostico> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
