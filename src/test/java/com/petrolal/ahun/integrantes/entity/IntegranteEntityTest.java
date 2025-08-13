package com.petrolal.ahun.integrantes.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.petrolal.ahun.integrantes.persistence.entity.Integrante;
import com.petrolal.ahun.integrantes.persistence.repository.IntegrantesRepository;

@DataJpaTest
public class IntegranteEntityTest {

	@Autowired
	private IntegrantesRepository integrantesRepository;
	
	@Test
	void testSavedIntegrante() {
		Integrante integrante = new Integrante();
		
	}
	
}
