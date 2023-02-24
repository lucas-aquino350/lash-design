package br.com.lashDesign.clienteprocedimento.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
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
	
	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @NotBlank @CPF String cpf, @NotBlank String telefone,
			@NotBlank @Email String email, @NotNull LocalDate dataDeNascimento, @NotNull Boolean aceitaTermos,
			LocalDateTime dataHoraCriacao, LocalDateTime dataHoraUltimaAlteracao) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		this.aceitaTermos = aceitaTermos;
		this.dataHoraCriacao = dataHoraCriacao;
		this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
	}	
}