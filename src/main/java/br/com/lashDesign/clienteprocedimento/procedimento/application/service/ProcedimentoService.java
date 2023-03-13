package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoListResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;

public interface ProcedimentoService {

	ProcedimentoResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest);
	List<ProcedimentoListResponse> buscaTodosProcedimentos();
	ProcedimentoDetalhadoResponse buscaProcedimentoAtravesId(UUID idProcedimento);
	List<ProcedimentoListResponse>buscaProcedimentosPorCliente(UUID idCliente);
	List<ProcedimentoListResponse> buscaProcedimentosPorExtensionista(UUID idExtensionista);
	List<ProcedimentoListResponse> buscaProcedimentosPorDataProcedimento(String dataDoProcedimento);
	void deletaProcedimentoAtravesId(UUID idProcedimento);
}
