package br.com.lashDesign.clienteprocedimento.cliente.application.service;

import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
