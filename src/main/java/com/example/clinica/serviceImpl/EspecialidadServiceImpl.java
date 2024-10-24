package com.example.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clinica.dao.EspecialidadDao;
import com.example.clinica.entity.Especialidad;
import com.example.clinica.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
	@Autowired
	private EspecialidadDao dao;
	
	@Override
	public Especialidad create(Especialidad a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Especialidad update(Especialidad a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Especialidad read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id).get();
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	
}
