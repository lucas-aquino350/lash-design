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

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaAlteracaoRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
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
	private UUID idExtensionista;
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
	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Extensionista(ExtensionistaRequest extensionistaRequest) {
		this.nomeCompleto = extensionistaRequest.getNomeCompleto();
		this.cpf = extensionistaRequest.getCpf();
		this.telefone = extensionistaRequest.getTelefone();
		this.tipoDeTecnica = extensionistaRequest.getTipoDeTecnica();
		this.email = extensionistaRequest.getEmail();
		this.dataDeNascimento = extensionistaRequest.getDataDeNascimento();
		this.dataHoraCriacao = LocalDateTime.now();
	}

	public void altera(ExtensionistaAlteracaoRequest extensionistaAlteracaoRequest) {
		this.telefone = extensionistaAlteracaoRequest.getTelefone();
		this.email = extensionistaAlteracaoRequest.getEmail();
		this.tipoDeTecnica = extensionistaAlteracaoRequest.getTipoDeTecnica();
		this.dataHoraUltimaAlteracao = LocalDateTime.now();
	}
}