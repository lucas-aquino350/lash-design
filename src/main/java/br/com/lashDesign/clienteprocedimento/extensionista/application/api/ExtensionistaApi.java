package br.com.lashDesign.clienteprocedimento.extensionista.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/extensionista")
public interface ExtensionistaApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ExtensionistaResponse postExtensionista(@Valid @RequestBody ExtensionistaRequest extensionistaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ExtensionistaListResponse> getTodosClientes();
	
	@GetMapping(value = "/{idExtensionista}")
	@ResponseStatus(code = HttpStatus.OK)
	ExtensionistaDetalhadoResponse getExtensionistaAtravesId(@PathVariable UUID idExtensionista);
	
	@DeleteMapping(value = "/{idExtensionista}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaExtensionistaAtravesId (@PathVariable UUID idExtensionista);
	
	@PatchMapping(value = "/{idExtensionista}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraExtensionista (@PathVariable UUID idExtensionista, 
			@Valid @RequestBody ExtensionistaAlteracaoRequest extensionistaAlteracaoRequest );
	
}