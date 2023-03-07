package br.com.lashDesign.clienteprocedimento.lash.application.api;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.lashDesign.clienteprocedimento.lash.domain.TipoDeTecnica;
import lombok.Value;

@Value
public class ExtensionistaRequest {
	
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
}