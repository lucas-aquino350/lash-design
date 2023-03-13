package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Sala;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.TipoTecnica;
import lombok.Value;

@Value
public class ProcedimentoAlteracaoRequest {

	private TipoTecnica tipoTecnica;
	private Sala salaProcedimento;
	private LocalDate dataDoProcedimento;
    private LocalTime horario;
    private String observacao;
    private LocalDate proximaManutencao;
}