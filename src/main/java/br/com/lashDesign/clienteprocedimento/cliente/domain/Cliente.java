package br.com.lashDesign.clienteprocedimento.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteAlteracaoRequest;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "cliente")
public class Cliente {

	@Id
	private UUID idCliente;
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

	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Cliente(ClienteRequest clienteRequest) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraCriacao = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
		this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
		this.telefone = clienteAlteracaoRequest.getTelefone();
		this.email = clienteAlteracaoRequest.getEmail();
		this.dataDeNascimento = clienteAlteracaoRequest.getDataDeNascimento();
		this.aceitaTermos = clienteAlteracaoRequest.getAceitaTermos();
		this.dataHoraUltimaAlteracao = LocalDateTime.now();
	}	
}