package br.com.lashDesign.clienteprocedimento.cliente.application.service;

import java.util.List;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteListResponse;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}