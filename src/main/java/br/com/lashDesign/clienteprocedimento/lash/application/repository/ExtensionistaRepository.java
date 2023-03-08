package br.com.lashDesign.clienteprocedimento.lash.application.repository;

import java.util.List;

import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;

public interface ExtensionistaRepository {

	Extensionista salva(Extensionista extensionista);
	List<Extensionista> buscaTodasExtensionistas();
}