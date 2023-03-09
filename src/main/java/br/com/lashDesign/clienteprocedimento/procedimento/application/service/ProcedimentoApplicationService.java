package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProcedimentoApplicationService implements ProcedimentoService {

	@Override
	public ProcedimentoResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoApplicationService - criaProcedimento");
		log.info("[finish] ProcedimentoApplicationService - criaProcedimento");
		return null;
	}
}