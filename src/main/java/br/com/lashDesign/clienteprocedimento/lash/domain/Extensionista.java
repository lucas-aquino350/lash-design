package br.com.lashDesign.clienteprocedimento.lash.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Extensionista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idLash;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String telefone;
	@NotBlank
	private TipoDeTecnica tipoDeTecnica;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Extensionista(@NotBlank String nomeCompleto, @NotBlank @CPF String cpf, @NotBlank String telefone,
			@NotBlank @Email String email, @NotNull LocalDate dataDeNascimento, LocalDateTime dataHoraCriacao,
			LocalDateTime dataHoraUltimaAlteracao) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		this.dataHoraCriacao = dataHoraCriacao;
		this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
	}
}