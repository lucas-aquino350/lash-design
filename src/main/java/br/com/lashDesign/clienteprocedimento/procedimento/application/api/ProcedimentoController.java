package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.util.List;
import java.util.UUID;

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
	public ProcedimentoIdResponse postProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoController  - postProcedimento");
		ProcedimentoIdResponse procedimentoCriado = procedimentoService.criaProcedimento(procedimentoRequest);
		log.info("[finish] ProcedimentoController  - postProcedimento");
		return procedimentoCriado;
	}

	@Override
	public List<ProcedimentoListResponse> getTodosProcedimentos() {
		log.info("[start] ProcedimentoController  - getTodosProcedimentos");
		List<ProcedimentoListResponse> procedimentos = procedimentoService.buscaTodosProcedimentos();
		log.info("[finish] ProcedimentoController  - getTodosProcedimentos");
		return procedimentos;
	}

	@Override
	public ProcedimentoDetalhadoResponse getProcedimentoAtravesId(UUID idProcedimento) {
		log.info("[start] ProcedimentoController  - getProcedimentoAtravesId");
		log.info("[idProcedimento] {}", idProcedimento);
		ProcedimentoDetalhadoResponse procedimentoDetalhado = procedimentoService.buscaProcedimentoAtravesId(idProcedimento);
		log.info("[finish] ProcedimentoController  - getProcedimentoAtravesId");
		return procedimentoDetalhado;
	}

	@Override
	public List<ProcedimentoResponse> buscaProcedimentosPorCliente(UUID idCliente) {
		log.info("[start] ProcedimentoController  - buscaProcedimentosPorCliente");
		log.info("[idCliente] {}", idCliente);
		List<ProcedimentoResponse> procedimentos = procedimentoService.buscaProcedimentosPorCliente(idCliente);
		log.info("[finish] ProcedimentoController  - buscaProcedimentosPorCliente");
		return procedimentos;
	}
}