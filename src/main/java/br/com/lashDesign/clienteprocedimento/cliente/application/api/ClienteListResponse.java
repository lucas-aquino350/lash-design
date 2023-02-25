package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.util.UUID;
import lombok.Value;

@Value
public class ClienteListResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
}