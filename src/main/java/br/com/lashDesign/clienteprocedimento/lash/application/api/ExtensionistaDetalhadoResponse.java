package br.com.lashDesign.clienteprocedimento.lash.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;
import br.com.lashDesign.clienteprocedimento.lash.domain.TipoDeTecnica;
import lombok.Value;

@Value
public class ExtensionistaDetalhadoResponse {
	
	private UUID idExtensionista;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	private String email;
	private LocalDate dataDeNascimento;
	
	public ExtensionistaDetalhadoResponse(Extensionista extensionista) {
		this.idExtensionista = extensionista.getIdExtensionista();
		this.nomeCompleto = extensionista.getNomeCompleto();
		this.cpf = extensionista.getCpf();
		this.telefone = extensionista.getTelefone();
		this.tipoDeTecnica = extensionista.getTipoDeTecnica();
		this.email = extensionista.getEmail();
		this.dataDeNascimento = extensionista.getDataDeNascimento();
	}
}