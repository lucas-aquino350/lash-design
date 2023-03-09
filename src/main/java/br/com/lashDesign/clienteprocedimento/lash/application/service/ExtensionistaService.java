package br.com.lashDesign.clienteprocedimento.lash.application.service;

import java.util.List;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaAlteracaoRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaListResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaResponse;

public interface ExtensionistaService {

	ExtensionistaResponse criaExtensionista(ExtensionistaRequest extensionistaRequest);
	List<ExtensionistaListResponse> buscaTodasExtensionistas();
	ExtensionistaDetalhadoResponse buscaExtensionistaAtravesId(UUID idExtensionista);
	void deletaExtensionista(UUID idExtensionista);
	void patchAlteraExtensionista(UUID idExtensionista,
			 ExtensionistaAlteracaoRequest extensionistaAlteracaoRequest);
}