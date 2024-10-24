package com.example.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clinica.dao.MedicoDao;
import com.example.clinica.entity.Medico;
import com.example.clinica.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{
	@Autowired
	private MedicoDao dao;
	
	@Override
	public Medico create(Medico a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Medico update(Medico a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Medico read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id).get();
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
