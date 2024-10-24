package com.example.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.entity.Diagnostico;
import com.example.clinica.service.DiagnosticoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/diagnosticos")
public class DiagnosticoController {
	@Autowired
	private DiagnosticoService service;
	
	@GetMapping
	public ResponseEntity<List<Diagnostico>> readAll(){
		try {
			List<Diagnostico> lista = service.readAll();
			if (lista.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(lista,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Diagnostico> create(@Valid @RequestBody Diagnostico a){
		try {
			Diagnostico pac = service.create(a);
			return new ResponseEntity<>(pac,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Diagnostico> getDiagnosticoId(@PathVariable("id") Long id){
		try {
			Diagnostico b = service.read(id);
			return new ResponseEntity<>(b,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Diagnostico> delDiagnosticoId(@PathVariable("id")Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDiagnostico(@PathVariable("id") Long id, @Valid @RequestBody Diagnostico pac){
		Diagnostico p = service.read(id);
			if(p.getId()>0){
				return new ResponseEntity<>(service.update(pac), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}
}
