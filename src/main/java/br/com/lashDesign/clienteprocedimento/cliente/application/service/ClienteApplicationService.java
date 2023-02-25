package br.com.lashDesign.clienteprocedimento.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteRequest;
import br.com.lashDesign.clienteprocedimento.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[start] ClienteApplicationService - criaCliente");
		log.info("[finish] ClienteApplicationService - criaCliente");
		return null;
	}

}
