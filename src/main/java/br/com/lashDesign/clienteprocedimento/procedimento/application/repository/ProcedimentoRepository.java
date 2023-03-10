package br.com.lashDesign.clienteprocedimento.procedimento.application.repository;

import java.util.List;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;

public interface ProcedimentoRepository {

	Procedimento salva(Procedimento procedimento);
	List<Procedimento> buscaTodosProcedimentos();
}