package br.com.lashDesign.clienteprocedimento.lash.application.service;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ExtensionistaApplicationService implements ExtensionistaService {

	@Override
	public ExtensionistaResponse criaExtensionista(ExtensionistaRequest extensionistaRequest) {
		log.info("[start] ExtensionistaApplicationService - criaExtensionista");
		log.info("[finish] ExtensionistaApplicationService - criaExtensionista");
		return null;
	}
}