package br.com.lashDesign.clienteprocedimento.extensionista.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ExtensionistaResponse {
	private UUID idExtensionista;
}