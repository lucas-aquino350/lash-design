package br.com.lashDesign.clienteprocedimento.lash.application.service;

import java.util.List;

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaListResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaResponse;

public interface ExtensionistaService {

	ExtensionistaResponse criaExtensionista(ExtensionistaRequest extensionistaRequest);
	List<ExtensionistaListResponse> buscaTodasExtensionistas();
}