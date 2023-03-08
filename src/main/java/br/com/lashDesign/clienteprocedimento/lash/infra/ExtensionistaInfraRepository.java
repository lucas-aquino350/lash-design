package br.com.lashDesign.clienteprocedimento.lash.infra;

import java.util.List;

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
		log.info("[start] ExtensionistaInfraRepository - salva ");
		extensionistaSpringDataJpaRepository.save(extensionista);
		log.info("[finish] ExtensionistaInfraRepository - salva ");
		return extensionista;
	}

	@Override
	public List<Extensionista> buscaTodasExtensionistas() {
		log.info("[start] ExtensionistaInfraRepository - buscaTodasExtensionistas ");
		log.info("[finish] ExtensionistaInfraRepository - buscaTodasExtensionistas ");
		return null;
	}
}