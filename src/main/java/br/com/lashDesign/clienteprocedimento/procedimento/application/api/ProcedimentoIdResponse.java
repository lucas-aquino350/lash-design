package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProcedimentoIdResponse {

	private UUID idProcedimento;
}