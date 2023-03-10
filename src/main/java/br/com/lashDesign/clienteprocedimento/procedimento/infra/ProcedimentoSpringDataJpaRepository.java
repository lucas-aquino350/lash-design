package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;

public interface ProcedimentoSpringDataJpaRepository extends JpaRepository<Procedimento, UUID>{

	List<Procedimento> findAllByIdCliente(UUID idCliente);
}