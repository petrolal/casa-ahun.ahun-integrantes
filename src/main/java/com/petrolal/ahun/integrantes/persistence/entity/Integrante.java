package com.petrolal.ahun.integrantes.persistence.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.petrolal.ahun.integrantes.model.CargoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "integrante")
public class Integrante {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "co_seq_integrante")
	private UUID id;

	@NotBlank(message = "Nome do integrante não pode ser vazio")
	private String nmIntegrante;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "Cargo do integrante não pode ser nulo")
	private CargoEnum nmCargo;

	@Column
	@NotBlank(message = "Número de telefone não pode ser nulo")
	private String nuTelefone;

	@Column
	private boolean stHabilitado = true;

	@Column
	private String nmEmail;

	@Temporal(TemporalType.DATE)
	private LocalDate dtAniversario;

	@Temporal(TemporalType.DATE)
	private LocalDate dtCriado = LocalDate.now();

	@Temporal(TemporalType.DATE)
	private LocalDate dtAtualizado;

	public Integrante() {
	}

	public Integrante(UUID id, String nmIntegrante, CargoEnum nmCargo, String nuTelefone, boolean stHabilitado,
			String nmEmail, LocalDate dtAniversario, LocalDate dtCriado, LocalDate dtAtualizado) {
		super();
		this.id = id;
		this.nmIntegrante = nmIntegrante;
		this.nmCargo = nmCargo;
		this.nuTelefone = nuTelefone;
		this.stHabilitado = stHabilitado;
		this.nmEmail = nmEmail;
		this.dtAniversario = dtAniversario;
		this.dtCriado = dtCriado;
		this.dtAtualizado = dtAtualizado;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNmIntegrante() {
		return nmIntegrante;
	}

	public void setNmIntegrante(String nmIntegrante) {
		this.nmIntegrante = nmIntegrante;
	}

	public CargoEnum getNmCargo() {
		return nmCargo;
	}

	public void setNmCargo(CargoEnum nmCargo) {
		this.nmCargo = nmCargo;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

	public boolean isStHabilitado() {
		return stHabilitado;
	}

	public void setStHabilitado(boolean stHabilitado) {
		this.stHabilitado = stHabilitado;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public LocalDate getDtAniversario() {
		return dtAniversario;
	}

	public void setDtAniversario(LocalDate dtAniversario) {
		this.dtAniversario = dtAniversario;
	}

	public LocalDate getDtCriado() {
		return dtCriado;
	}

	public void setDtCriado(LocalDate dtCriado) {
		this.dtCriado = dtCriado;
	}

	public LocalDate getDtAtualizado() {
		return dtAtualizado;
	}

	public void setDtAtualizado(LocalDate dtAtualizado) {
		this.dtAtualizado = dtAtualizado;
	}

}
