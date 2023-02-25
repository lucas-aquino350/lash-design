package br.com.lashDesign.clienteprocedimento.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lashDesign.clienteprocedimento.cliente.domain.Cliente;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {

}