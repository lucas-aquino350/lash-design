package br.com.lashDesign.clienteprocedimento.procedimento.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "procedimento")
public class Procedimento {

	@Id
	private UUID idProcedimento;
	@NotNull
	private UUID idCliente;
	private TipoTecnica tipoTecnica;
	@NotNull
	private UUID idExtensionista;
	@NotNull
	private Double valor;
	private Sala salaProcedimento;
	private StatusProcedimento statusProcedimento;
	@NotNull
	private LocalDate dataDoProcedimento;
	@NotNull
    private LocalTime horario;
	@NotBlank
    private String observacao;
	@NotNull
    private LocalDate proximaManutencao;
	
	
	private LocalDateTime dataHoraCriacao;
	private LocalDateTime dataHoraUltimaAlteracao;
	
	public Procedimento(ProcedimentoRequest procedimentoRequest) {
		this.idProcedimento = UUID.randomUUID();
		this.idCliente = procedimentoRequest.getIdCliente();
		this.tipoTecnica = procedimentoRequest.getTipoTecnica();
		this.idExtensionista = procedimentoRequest.getIdExtensionista();
		this.valor = procedimentoRequest.getValor();
		this.salaProcedimento = procedimentoRequest.getSalaProcedimento();
		this.statusProcedimento = StatusProcedimento.A_fazer;
		this.dataDoProcedimento = procedimentoRequest.getDataDoProcedimento();
		this.horario = procedimentoRequest.getHorario();
		this.observacao = procedimentoRequest.getObservacao();
		this.proximaManutencao = procedimentoRequest.getProximaManutencao();
		this.dataHoraCriacao = LocalDateTime.now();
	}
}