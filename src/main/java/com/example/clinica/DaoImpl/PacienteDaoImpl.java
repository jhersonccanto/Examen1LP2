package com.example.clinica.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.clinica.dao.PacienteDao;
import com.example.clinica.entity.Paciente;
import com.example.clinica.repository.PacienteRepository;

@Component
public class PacienteDaoImpl implements PacienteDao{
	@Autowired
	private PacienteRepository repository;
	
	@Override
	public Paciente create(Paciente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Paciente update(Paciente a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Paciente read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
