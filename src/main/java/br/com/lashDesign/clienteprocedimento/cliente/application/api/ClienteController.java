package br.com.lashDesign.clienteprocedimento.cliente.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<ClienteListResponse> getTodosCliente() {
		log.info("[start] ClienteController - getTodosCliente");
		List<ClienteListResponse> clientes = clienteService. buscaTodosClientes();
		log.info("[finish] ClienteController - getTodosCliente");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
		log.info("[start] ClienteController - getClienteAtravesId");
		log.info("[idCliente] {}", idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finish] ClienteController - getClienteAtravesId");
		return clienteDetalhado;
	}

	@Override
	public void deletaClienteAtravesID(UUID idCliente) {
		log.info("[start] ClienteController - deletaClienteAtravesID");
		log.info("[idCliente] {}", idCliente);
		log.info("[finish] ClienteController - deletaClienteAtravesID");
	}
}