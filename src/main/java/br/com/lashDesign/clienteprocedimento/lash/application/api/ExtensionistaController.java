package br.com.lashDesign.clienteprocedimento.lash.application.api;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ExtensionistaController implements ExtensionistaApi {

	@Override
	public ExtensionistaResponse postExtensionista(@Valid ExtensionistaRequest extensionistaRequest) {
		log.info("[start] ExtensionistaController - postExtensionista");
		log.info("[finish] ExtensionistaController - postExtensionista");
		return null;
	}

}
