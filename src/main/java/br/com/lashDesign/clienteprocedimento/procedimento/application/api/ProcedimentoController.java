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
	public ProcedimentoResponse postProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoController  - postProcedimento");
		ProcedimentoResponse procedimentoCriado = procedimentoService.criaProcedimento(procedimentoRequest);
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
	public List<ProcedimentoListResponse> buscaProcedimentosPorCliente(UUID idCliente) {
		log.info("[start] ProcedimentoController  - buscaProcedimentosPorCliente");
		log.info("[idCliente] {}", idCliente);
		List<ProcedimentoListResponse> procedimentos = procedimentoService.buscaProcedimentosPorCliente(idCliente);
		log.info("[finish] ProcedimentoController  - buscaProcedimentosPorCliente");
		return procedimentos;
	}

	@Override
	public List<ProcedimentoListResponse> buscaProcedimentosPorExtensionista(UUID idExtensionista) {
		log.info("[start] ProcedimentoController  - buscaProcedimentosPorExtensionista");
		log.info("[idExtensionista] {}", idExtensionista);
		List<ProcedimentoListResponse> procedimentos = procedimentoService.buscaProcedimentosPorExtensionista(idExtensionista);
		log.info("[finish] ProcedimentoController  - buscaProcedimentosPorExtensionista");
		return procedimentos;
	}
}