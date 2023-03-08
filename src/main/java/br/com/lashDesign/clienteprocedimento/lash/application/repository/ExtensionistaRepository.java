package br.com.lashDesign.clienteprocedimento.lash.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;

public interface ExtensionistaRepository {

	Extensionista salva(Extensionista extensionista);
	List<Extensionista> buscaTodasExtensionistas();
	Extensionista buscaExtensionistaAtravesId(UUID idExtensionista);
}