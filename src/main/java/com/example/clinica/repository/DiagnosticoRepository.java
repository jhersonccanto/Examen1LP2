package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.entity.Diagnostico;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
