package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoListResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;

public interface ProcedimentoService {

	ProcedimentoResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest);
	List<ProcedimentoListResponse> buscaTodosProcedimentos();
	ProcedimentoDetalhadoResponse buscaProcedimentoAtravesId(UUID idProcedimento);
}