package com.example.clinica.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.clinica.dao.EspecialidadDao;
import com.example.clinica.entity.Especialidad;
import com.example.clinica.repository.EspecialidadRepository;

@Component
public class EspecialidadDaoImpl implements EspecialidadDao{
	@Autowired
	private EspecialidadRepository repository;
	
	@Override
	public Especialidad create(Especialidad a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Especialidad update(Especialidad a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
