package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.cliente.application.repository.ClienteRepository;
import br.com.lashDesign.clienteprocedimento.extensionista.application.repository.ExtensionistaRepository;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoRequest;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.repository.ProcedimentoRepository;
import br.com.lashDesign.clienteprocedimento.procedimento.domain.Procedimento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProcedimentoApplicationService implements ProcedimentoService {

	private final ProcedimentoRepository procedimentoRepository;
    private final ClienteRepository clienteRepository;
    private final ExtensionistaRepository extensionistaRepository;

	@Override
	public ProcedimentoResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoApplicationService - criaProcedimento");
		clienteRepository.buscaClienteAtravesID(procedimentoRequest.getIdCliente());
		extensionistaRepository.buscaExtensionistaAtravesId(procedimentoRequest.getIdExtensionista());
		Procedimento procedimento = procedimentoRepository.salva(new Procedimento(procedimentoRequest));
		log.info("[finish] ProcedimentoApplicationService - criaProcedimento");
		return ProcedimentoResponse.builder()
				.idProcedimento(procedimento.getIdProcedimento())
				.build();
	}
}