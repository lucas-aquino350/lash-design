package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Value;

@Value
public class ClienteRequest {

	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NotBlank
	private String telefone;
	@NotBlank
	@Email
	@Indexed(unique = true)
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Boolean aceitaTermos;
}