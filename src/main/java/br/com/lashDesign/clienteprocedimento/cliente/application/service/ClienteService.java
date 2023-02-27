package br.com.lashDesign.clienteprocedimento.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteListResponse;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
}