package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.procedimento.application.repository.ProcedimentoRepository;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProcedimentoInfraRepository implements ProcedimentoRepository {

	private final ProcedimentoSpringDataJpaRepository procedimentoSpringDataJpaRepository;

	@Override
	public Procedimento salva(Procedimento procedimento) {
		log.info("[start] ProcedimentoInfraRepository - salva");
		procedimentoSpringDataJpaRepository.save(procedimento);
		log.info("[finish] ProcedimentoInfraRepository - salva");
		return procedimento;
	}
}