package br.com.lashDesign.clienteprocedimento.cliente.application.repository;

import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
}