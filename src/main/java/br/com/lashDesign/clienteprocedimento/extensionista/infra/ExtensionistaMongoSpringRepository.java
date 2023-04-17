package br.com.lashDesign.clienteprocedimento.extensionista.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lashDesign.clienteprocedimento.extensionista.domain.Extensionista;

public interface ExtensionistaMongoSpringRepository extends MongoRepository<Extensionista, UUID> {

	Optional<Extensionista> findByIdExtensionista(UUID idExtensionista);

}
