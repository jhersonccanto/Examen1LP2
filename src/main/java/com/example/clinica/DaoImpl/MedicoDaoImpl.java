package com.example.clinica.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.clinica.dao.MedicoDao;
import com.example.clinica.entity.Medico;
import com.example.clinica.repository.MedicoRepository;

@Component
public class MedicoDaoImpl implements MedicoDao{
	@Autowired
	private MedicoRepository repository;
	
	@Override
	public Medico create(Medico a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Medico update(Medico a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Medico> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
