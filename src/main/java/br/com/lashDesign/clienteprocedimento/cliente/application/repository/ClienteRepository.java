package br.com.lashDesign.clienteprocedimento.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesID(UUID idCliente);
	void deletaCliente(Cliente cliente);
}