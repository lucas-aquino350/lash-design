package br.com.lashDesign.clienteprocedimento.lash.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaListResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaRequest;
import br.com.lashDesign.clienteprocedimento.lash.application.api.ExtensionistaResponse;
import br.com.lashDesign.clienteprocedimento.lash.application.repository.ExtensionistaRepository;
import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ExtensionistaApplicationService implements ExtensionistaService {

	private final ExtensionistaRepository extensionistaRepository;

	@Override
	public ExtensionistaResponse criaExtensionista(ExtensionistaRequest extensionistaRequest) {
		log.info("[start] ExtensionistaApplicationService - criaExtensionista");
		Extensionista extensionista = extensionistaRepository.salva(new Extensionista(extensionistaRequest));
		log.info("[finish] ExtensionistaApplicationService - criaExtensionista");
		return ExtensionistaResponse.builder()
				.idExtensionista(extensionista.getIdExtensionista())
				.build();
	}

	@Override
	public List<ExtensionistaListResponse> buscaTodasExtensionistas() {
		log.info("[start] ExtensionistaApplicationService -  buscaTodasExtensionistas");
		List<Extensionista> extensionistas = extensionistaRepository.buscaTodasExtensionistas();
		log.info("[finish] ExtensionistaApplicationService -  buscaTodasExtensionistas");
		return ExtensionistaListResponse.converte(extensionistas);
	}

	@Override
	public ExtensionistaDetalhadoResponse buscaExtensionistaAtravesId(UUID idExtensionista) {
		log.info("[start] ExtensionistaApplicationService -  buscaExtensionistaAtravesId");
		Extensionista extensionista = extensionistaRepository.buscaExtensionistaAtravesId(idExtensionista);
		log.info("[finish] ExtensionistaApplicationService -  buscaExtensionistaAtravesId");
		return new ExtensionistaDetalhadoResponse(extensionista);
	}

	@Override
	public void deletaExtensionista(UUID idExtensionista) {
		log.info("[start] ExtensionistaApplicationService -  deletaExtensionista");
		Extensionista extensionista = extensionistaRepository.buscaExtensionistaAtravesId(idExtensionista);
		extensionistaRepository.deletaExtensionistaAtravesId(extensionista);
		log.info("[finish] ExtensionistaApplicationService -  deletaExtensionista");
	}
}