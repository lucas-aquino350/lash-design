package br.com.lashDesign.clienteprocedimento.lash.infra;

import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.lash.application.repository.ExtensionistaRepository;
import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ExtensionistaInfraRepository implements ExtensionistaRepository {

	private final ExtensionistaSpringDataJpaRepository extensionistaSpringDataJpaRepository;

	@Override
	public Extensionista salva(Extensionista extensionista) {
		log.info("[START] ExtensionistaInfraRepository - SALVA ");
		extensionistaSpringDataJpaRepository.save(extensionista);
		log.info("[FINISH] ExtensionistaInfraRepository - SALVA ");
		return extensionista;
	}
}