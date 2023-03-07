package br.com.lashDesign.clienteprocedimento.lash.application.api;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

import br.com.lashDesign.clienteprocedimento.lash.application.service.ExtensionistaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ExtensionistaController implements ExtensionistaApi {

	private final ExtensionistaService extensionistaService;

	@Override
	public ExtensionistaResponse postExtensionista(@Valid ExtensionistaRequest extensionistaRequest) {
		log.info("[start] ExtensionistaController - postExtensionista");
		ExtensionistaResponse extensionistaCriada = extensionistaService.criaExtensionista(extensionistaRequest);
		log.info("[finish] ExtensionistaController - postExtensionista");
		return extensionistaCriada;
	}
}