package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
	private LocalDate dataDeNascimento;
	private Boolean aceitaTermos;
}