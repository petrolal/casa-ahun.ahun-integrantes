package com.petrolal.ahun.integrantes.persistence.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petrolal.ahun.integrantes.persistence.entity.Integrante;

public interface IntegrantesRepository extends JpaRepository<Integrante, UUID> {
}
