package br.com.lashDesign.clienteprocedimento.cliente.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;

public interface ClienteMongoSpringRepository extends MongoRepository<Cliente, UUID> {

	Optional<Cliente> findByIdCliente(UUID idCliente);
}