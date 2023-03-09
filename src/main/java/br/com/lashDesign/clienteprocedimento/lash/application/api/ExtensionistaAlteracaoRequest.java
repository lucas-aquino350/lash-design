package br.com.lashDesign.clienteprocedimento.lash.application.api;

import br.com.lashDesign.clienteprocedimento.lash.domain.TipoDeTecnica;
import lombok.Value;

@Value
public class ExtensionistaAlteracaoRequest {
	private String telefone;
	private TipoDeTecnica tipoDeTecnica;
	private String email;
}
