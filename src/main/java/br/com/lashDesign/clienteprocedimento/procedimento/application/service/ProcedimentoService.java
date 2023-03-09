package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import javax.validation.Valid;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;

public interface ProcedimentoService {

	ProcedimentoResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest);

}
