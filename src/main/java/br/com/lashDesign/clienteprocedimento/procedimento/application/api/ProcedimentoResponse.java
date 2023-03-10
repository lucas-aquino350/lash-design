package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.Sala;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.StatusProcedimento;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.TipoTecnica;
import lombok.Value;

@Value
public class ProcedimentoResponse {
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
    
	public static List<ProcedimentoResponse> converte(List<Procedimento> procedimentos) {
		return procedimentos.stream().map(ProcedimentoResponse::new).collect(Collectors.toList());
	}

	public ProcedimentoResponse(Procedimento procedimento) {
		this.idProcedimento = procedimento.getIdProcedimento();
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