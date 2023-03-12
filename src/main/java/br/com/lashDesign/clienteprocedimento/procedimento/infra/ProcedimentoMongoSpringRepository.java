package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;

public interface ProcedimentoMongoSpringRepository extends MongoRepository<Procedimento, UUID>{

	List<Procedimento> findAllByIdCliente(UUID idCliente);
	List<Procedimento> findAllByIdExtensionista(UUID idExtensionista);
}