package br.com.lashDesign.clienteprocedimento.extensionista.application.api;

import br.com.lashDesign.clienteprocedimento.extensionista.domain.TipoDeTecnica;
import lombok.Value;

@Value
public class ExtensionistaAlteracaoRequest {
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	private String email;
}
