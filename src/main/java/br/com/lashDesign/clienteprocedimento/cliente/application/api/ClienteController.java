package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.lashDesign.clienteprocedimento.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {

	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[start] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finish] ClienteController - postCliente");
		return clienteCriado;
	}
}