package br.com.lashDesign.clienteprocedimento.procedimento.infra;

import org.springframework.stereotype.Repository;

import br.com.lashDesign.clienteprocedimento.procedimento.application.repository.ProcedimentoRepository;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ProcedimentoInfraRepository implements ProcedimentoRepository {

	@Override
	public Procedimento salva(Procedimento procedimento) {
		log.info("[start] ProcedimentoInfraRepository - salva");
		log.info("[finish] ProcedimentoInfraRepository - salva");
		return procedimento;
	}
}