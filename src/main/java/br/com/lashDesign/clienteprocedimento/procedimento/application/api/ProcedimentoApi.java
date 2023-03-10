package br.com.lashDesign.clienteprocedimento.procedimento.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
}