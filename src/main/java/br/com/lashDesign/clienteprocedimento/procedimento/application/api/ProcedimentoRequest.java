package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Sala;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.TipoTecnica;
import lombok.Value;

@Value
public class ProcedimentoRequest {

	@NotNull
	private UUID idCliente;
	private TipoTecnica tipoTecnica;
	@NotNull
	private UUID idExtensionista;
	@NotNull
	private Double valor;
	private Sala salaProcedimento;
	@NotNull
	private LocalDate dataDoProcedimento;
	@NotNull
    private LocalTime horario;
	@NotBlank
    private String observacao;
	@NotNull
    private LocalDate proximaManutencao;
}