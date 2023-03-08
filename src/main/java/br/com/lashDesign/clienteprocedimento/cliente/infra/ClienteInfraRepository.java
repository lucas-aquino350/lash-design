package br.com.lashDesign.clienteprocedimento.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.cliente.application.repository.ClienteRepository;
import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;
import br.com.lashDesign.clienteprocedimento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - salva");
		try {
			clienteSpringDataJpaRepository.save(cliente);
		} catch(DataIntegrityViolationException e){
		    throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados",e);
		}
		log.info("[finish] ClienteInfraRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[start] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJpaRepository.findAll();
		log.info("[finish] ClienteInfraRepository - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesID(UUID idCliente) {
		log.info("[start] ClienteInfraRepository - buscaClienteAtravesID");
		Cliente cliente = clienteSpringDataJpaRepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Cliente não encontrado!"));
		log.info("[finish] ClienteInfraRepository - buscaClienteAtravesID");
		return cliente;
	}

	@Override
	public void deletaCliente(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - deletaCliente");
		clienteSpringDataJpaRepository.delete(cliente);
		log.info("[finish] ClienteInfraRepository - deletaCliente");
	}
}