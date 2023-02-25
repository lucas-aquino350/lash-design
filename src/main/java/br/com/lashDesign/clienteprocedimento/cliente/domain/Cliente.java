package br.com.lashDesign.clienteprocedimento.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable=false, unique=true, nullable=false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	private String cpf;
	@NotBlank
	private String telefone;
	@NotBlank
	@Email
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
	@NotNull
	private Boolean aceitaTermos;
	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.telefone = clienteRequest.getTelefone();
		this.email = clienteRequest.getEmail();
		this.dataDeNascimento = clienteRequest.getDataDeNascimento();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraCriacao = LocalDateTime.now();
	}	
}