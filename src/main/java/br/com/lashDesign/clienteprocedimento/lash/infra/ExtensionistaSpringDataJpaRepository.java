package br.com.lashDesign.clienteprocedimento.lash.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lashDesign.clienteprocedimento.lash.domain.Extensionista;

public interface ExtensionistaSpringDataJpaRepository extends JpaRepository<Extensionista, UUID> {

}
