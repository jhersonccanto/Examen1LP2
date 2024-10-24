package com.example.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clinica.dao.PacienteDao;
import com.example.clinica.entity.Paciente;
import com.example.clinica.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {
@Autowired
	private PacienteDao dao;
	
	@Override
	public Paciente create(Paciente a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Paciente update(Paciente a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Paciente read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
