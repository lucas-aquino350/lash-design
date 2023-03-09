package br.com.lashDesign.clienteprocedimento.procedimento.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	
	public Procedimento(@NotNull UUID idCliente, TipoTecnica tipoTecnica, @NotNull UUID idExtensionista,
			@NotNull Double valor, Sala salaProcedimento, StatusProcedimento statusProcedimento,
			@NotNull LocalDate dataDoProcedimento, @NotNull LocalTime horario, @NotBlank String observacao,
			@NotNull LocalDate proximaManutencao) {
		this.idCliente = idCliente;
		this.tipoTecnica = tipoTecnica;
		this.idExtensionista = idExtensionista;
		this.valor = valor;
		this.salaProcedimento = salaProcedimento;
		this.statusProcedimento = statusProcedimento;
		this.dataDoProcedimento = dataDoProcedimento;
		this.horario = horario;
		this.observacao = observacao;
		this.proximaManutencao = proximaManutencao;
	}
}