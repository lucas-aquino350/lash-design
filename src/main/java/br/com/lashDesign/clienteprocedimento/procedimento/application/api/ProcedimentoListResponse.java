package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Sala;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.StatusProcedimento;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.TipoTecnica;
import lombok.Value;

@Value
public class ProcedimentoListResponse {
	private UUID idProcedimento;
	private UUID idCliente;
	private TipoTecnica tipoTecnica;
	private UUID idExtensionista;
	private Double valor;
	private Sala salaProcedimento;
	private StatusProcedimento statusProcedimento;
	private LocalDate dataDoProcedimento;
    private LocalTime horario;
    private String observacao;
    private LocalDate proximaManutencao;
}