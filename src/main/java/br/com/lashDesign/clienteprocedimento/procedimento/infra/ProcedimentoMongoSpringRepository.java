package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;

public interface ProcedimentoMongoSpringRepository extends MongoRepository<Procedimento, UUID>{

	List<Procedimento> findAllByIdCliente(UUID idCliente);
	List<Procedimento> findAllByIdExtensionista(UUID idExtensionista);
	List<Procedimento> findAllByDataDoProcedimento(LocalDate data);
	Optional<Procedimento> findByIdProcedimento(UUID idProcedimento);
}