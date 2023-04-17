package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;
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
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
		this.dataDeNascimento = cliente.getDataDeNascimento();
		this.aceitaTermos = cliente.getAceitaTermos();
	}	
}