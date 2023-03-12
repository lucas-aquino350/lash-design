package br.com.lashDesign.clienteprocedimento.extensionista.domain;

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

import br.com.lashDesign.clienteprocedimento.extensionista.application.api.ExtensionistaAlteracaoRequest;
import br.com.lashDesign.clienteprocedimento.extensionista.application.api.ExtensionistaRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "extensionista")
public class Extensionista {

	@Id
	private UUID idExtensionista;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@CPF
	@Indexed(unique = true)
	private String cpf;
	@NotBlank
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	@NotBlank
	@Email
	@Indexed(unique = true)
	private String email;
	@NotNull
	private LocalDate dataDeNascimento;
	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Extensionista(ExtensionistaRequest extensionistaRequest) {
		this.idExtensionista = UUID.randomUUID();
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