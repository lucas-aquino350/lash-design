package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ProcedimentoController implements ProcedimentoApi {

	@Override
	public ProcedimentoResponse postProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoController  - postProcedimento");
		log.info("[finish] ProcedimentoController  - postProcedimento");
		return null;
	}

}
