package com.example.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clinica.dao.DiagnosticoDao;
import com.example.clinica.entity.Diagnostico;
import com.example.clinica.service.DiagnosticoService;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService{
	@Autowired
	private DiagnosticoDao dao;
	
	@Override
	public Diagnostico create(Diagnostico a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Diagnostico update(Diagnostico a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Diagnostico read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id).get();
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}


}
