package br.com.lashDesign.clienteprocedimento.lash.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;
import br.com.lashDesign.clienteprocedimento.lash.domain.TipoDeTecnica;
import lombok.Value;

@Value
public class ExtensionistaListResponse {
 
	private UUID idExtensionista;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	private String email;
	private LocalDate dataDeNascimento;
	
	public static List<ExtensionistaListResponse> converte(List<Extensionista> extensionistas) {
		// TODO Auto-generated method stub
		return null;
	}
}