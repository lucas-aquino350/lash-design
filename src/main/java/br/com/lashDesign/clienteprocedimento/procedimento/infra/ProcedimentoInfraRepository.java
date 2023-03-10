package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.handler.APIException;
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

	@Override
	public List<Procedimento> buscaTodosProcedimentos() {
		log.info("[start] ProcedimentoInfraRepository - buscaTodosProcedimentos");
		List<Procedimento> todosProcedimentos = procedimentoSpringDataJpaRepository.findAll();
		log.info("[finish] ProcedimentoInfraRepository - buscaTodosProcedimentos");
		return todosProcedimentos;
	}

	@Override
	public Procedimento buscaProcedimentoAtraves(UUID idProcedimento) {
		log.info("[start] ProcedimentoInfraRepository - buscaProcedimentoAtraves");
		Procedimento procedimento = procedimentoSpringDataJpaRepository.findById(idProcedimento)
				.orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST, "Procedimento não encontrado!"));
		log.info("[finish] ProcedimentoInfraRepository - buscaProcedimentoAtraves");
		return procedimento;
	}

	@Override
	public List<Procedimento> buscaProcedimentoPorCliente(UUID idCliente) {
		log.info("[start] ProcedimentoInfraRepository - buscaProcedimentoPorCliente");
		List<Procedimento> listaDeProcedimentos = procedimentoSpringDataJpaRepository.findAllByIdCliente(idCliente);
		log.info("[finish] ProcedimentoInfraRepository - buscaProcedimentoPorCliente");
		return listaDeProcedimentos;
	}
}