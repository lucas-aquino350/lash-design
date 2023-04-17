package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.Sala;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.StatusProcedimento;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.TipoTecnica;
import lombok.Value;

@Value
public class ProcedimentoDetalhadoResponse {
	
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
    

    public ProcedimentoDetalhadoResponse(Procedimento procedimento) {
		this.idCliente = procedimento.getIdCliente();
		this.tipoTecnica = procedimento.getTipoTecnica();
		this.idExtensionista = procedimento.getIdExtensionista();
		this.valor = procedimento.getValor();
		this.salaProcedimento = procedimento.getSalaProcedimento();
		this.statusProcedimento = procedimento.getStatusProcedimento();
		this.dataDoProcedimento = procedimento.getDataDoProcedimento();
		this.horario = procedimento.getHorario();
		this.observacao = procedimento.getObservacao();
		this.proximaManutencao = procedimento.getProximaManutencao();
	}
}