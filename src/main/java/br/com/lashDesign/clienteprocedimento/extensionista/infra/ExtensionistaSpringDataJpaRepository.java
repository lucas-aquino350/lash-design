package br.com.lashDesign.clienteprocedimento.extensionista.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lashDesign.clienteprocedimento.extensionista.domain.Extensionista;

public interface ExtensionistaSpringDataJpaRepository extends JpaRepository<Extensionista, UUID> {

}
