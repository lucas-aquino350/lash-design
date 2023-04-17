package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class ClienteAlteracaoRequest {

	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String telefone;
	@NotBlank
	@Email
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Boolean aceitaTermos;
}