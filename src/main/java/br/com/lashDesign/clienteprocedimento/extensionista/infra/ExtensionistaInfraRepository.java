package br.com.lashDesign.clienteprocedimento.extensionista.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.extensionista.application.repository.ExtensionistaRepository;
import br.com.lashDesign.clienteprocedimento.extensionista.domain.Extensionista;
import br.com.lashDesign.clienteprocedimento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ExtensionistaInfraRepository implements ExtensionistaRepository {

	private final ExtensionistaMongoSpringRepository extensionistaMongoSpringRepository;

	@Override
	public Extensionista salva(Extensionista extensionista) {
		log.info("[start] ExtensionistaInfraRepository - salva ");
		try {
			extensionistaMongoSpringRepository.save(extensionista);
		} catch(DataIntegrityViolationException e){
		    throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados",e);
		}
		log.info("[finish] ExtensionistaInfraRepository - salva ");
		return extensionista;
	}

	@Override
	public List<Extensionista> buscaTodasExtensionistas() {
		log.info("[start] ExtensionistaInfraRepository - buscaTodasExtensionistas ");
		List<Extensionista> todasExtensionistas = extensionistaMongoSpringRepository.findAll();
		log.info("[finish] ExtensionistaInfraRepository - buscaTodasExtensionistas ");
		return todasExtensionistas;
	}

	@Override
	public Extensionista buscaExtensionistaAtravesId(UUID idExtensionista) {
		log.info("[start] ExtensionistaInfraRepository - buscaExtensionistaAtravesId");
		Extensionista extensionista = extensionistaMongoSpringRepository.findByIdExtensionista(idExtensionista)
				.orElseThrow(() ->  APIException.build(HttpStatus.BAD_REQUEST, "Extensionista não encontrada!"));
		log.info("[finish] ExtensionistaInfraRepository - buscaExtensionistaAtravesId");
		return extensionista;
	}

	@Override
	public void deletaExtensionistaAtravesId(Extensionista extensionista) {
		log.info("[start] ExtensionistaInfraRepository - deletaExtensionistaAtravesId");
		extensionistaMongoSpringRepository.delete(extensionista);
		log.info("[finish] ExtensionistaInfraRepository - deletaExtensionistaAtravesId");
	}
}