package br.com.lashDesign.clienteprocedimento.lash.application.service;

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaResponse;

public interface ExtensionistaService {

	ExtensionistaResponse criaExtensionista(ExtensionistaRequest extensionistaRequest);
}