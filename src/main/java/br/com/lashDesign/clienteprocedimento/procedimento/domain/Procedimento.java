package br.com.lashDesign.clienteprocedimento.procedimento.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Procedimento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idProcedimento", updatable = false, unique = true, nullable = false)
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