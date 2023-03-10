package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoListResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoIdResponse;

public interface ProcedimentoService {

	ProcedimentoIdResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest);
	List<ProcedimentoListResponse> buscaTodosProcedimentos();
	ProcedimentoDetalhadoResponse buscaProcedimentoAtravesId(UUID idProcedimento);
	List<ProcedimentoResponse> buscaProcedimentosPorCliente(UUID idCliente);
}