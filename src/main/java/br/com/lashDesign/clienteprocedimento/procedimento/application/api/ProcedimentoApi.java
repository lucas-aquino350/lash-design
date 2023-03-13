package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

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
@RequestMapping("v1/procedimento")
public interface ProcedimentoApi {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ProcedimentoResponse postProcedimento (@Valid @RequestBody ProcedimentoRequest procedimentoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ProcedimentoListResponse> getTodosProcedimentos();
	
	@GetMapping("/{idProcedimento}")
	@ResponseStatus(code = HttpStatus.OK)
	ProcedimentoDetalhadoResponse getProcedimentoAtravesId (@PathVariable UUID idProcedimento);
	
	@GetMapping("/listaPorCliente/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
	List<ProcedimentoListResponse> buscaProcedimentosPorCliente ( @PathVariable UUID idCliente);
	
	@GetMapping("/listaPorExtensionista/{idExtensionista}")
    @ResponseStatus(code = HttpStatus.OK)
	List<ProcedimentoListResponse> buscaProcedimentosPorExtensionista ( @PathVariable UUID idExtensionista);
	
	@GetMapping("/listaPorDataProcedimento/{dataDoProcedimento}")
    @ResponseStatus(code = HttpStatus.OK)
	List<ProcedimentoListResponse> buscaProcedimentosPorDataProcedimento ( @PathVariable String dataDoProcedimento);
	
	@DeleteMapping("/{idProcedimento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaProcedimentoAtravesId(@PathVariable UUID idProcedimento);
	
	@PatchMapping("/{idProcedimento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraProcedimento(@PathVariable UUID idProcedimento, @Valid @RequestBody ProcedimentoAlteracaoRequest procedimentoAlteracaoRequest);
	
}