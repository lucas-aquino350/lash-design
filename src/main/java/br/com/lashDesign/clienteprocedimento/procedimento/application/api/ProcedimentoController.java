package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.lashDesign.clienteprocedimento.procedimento.application.service.ProcedimentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProcedimentoController implements ProcedimentoApi {

	private final ProcedimentoService procedimentoService;

	@Override
	public ProcedimentoResponse postProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoController  - postProcedimento");
		ProcedimentoResponse procedimentoCriado = procedimentoService.criaProcedimento(procedimentoRequest);
		log.info("[finish] ProcedimentoController  - postProcedimento");
		return procedimentoCriado;
	}

	@Override
	public List<ProcedimentoListResponse> getTodosProcedimentos() {
		log.info("[start] ProcedimentoController  - getTodosProcedimentos");
		log.info("[finish] ProcedimentoController  - getTodosProcedimentos");
		return null;
	}
}