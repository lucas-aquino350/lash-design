package br.com.lashDesign.clienteprocedimento.procedimento.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.lashDesign.clienteprocedimento.cliente.application.repository.ClienteRepository;
import br.com.lashDesign.clienteprocedimento.extensionista.application.repository.ExtensionistaRepository;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoDetalhadoResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoIdResponse;
import br.com.lashDesign.clienteprocedimento.procedimento.application.api.ProcedimentoListResponse;
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
	public ProcedimentoIdResponse criaProcedimento(@Valid ProcedimentoRequest procedimentoRequest) {
		log.info("[start] ProcedimentoApplicationService - criaProcedimento");
		clienteRepository.buscaClienteAtravesID(procedimentoRequest.getIdCliente());
		extensionistaRepository.buscaExtensionistaAtravesId(procedimentoRequest.getIdExtensionista());
		Procedimento procedimento = procedimentoRepository.salva(new Procedimento(procedimentoRequest));
		log.info("[finish] ProcedimentoApplicationService - criaProcedimento");
		return ProcedimentoIdResponse.builder()
				.idProcedimento(procedimento.getIdProcedimento())
				.build();
	}

	@Override
	public List<ProcedimentoListResponse> buscaTodosProcedimentos() {
		log.info("[start] ProcedimentoApplicationService -  buscaTodosProcedimentos");
		List<Procedimento> procedimentos = procedimentoRepository.buscaTodosProcedimentos();
		log.info("[finish] ProcedimentoApplicationService -  buscaTodosProcedimentos");
		return ProcedimentoListResponse.converte(procedimentos);
	}

	@Override
	public ProcedimentoDetalhadoResponse buscaProcedimentoAtravesId(UUID idProcedimento) {
		log.info("[start] ProcedimentoApplicationService -  buscaProcedimentoAtravesId");
		Procedimento procedimento = procedimentoRepository.buscaProcedimentoAtraves(idProcedimento);
		log.info("[finish] ProcedimentoApplicationService -  buscaProcedimentoAtravesId");
		return new ProcedimentoDetalhadoResponse(procedimento);
	}

	@Override
	public List<ProcedimentoResponse> buscaProcedimentosPorCliente(UUID idCliente) {
		log.info("[start] ProcedimentoApplicationService -  buscaProcedimentosPorCliente");
		clienteRepository.buscaClienteAtravesID(idCliente);
		//List<Procedimento> procedimentos = procedimentoRepository.buscaTodosProcedimentos();
		List<Procedimento> procedimentosDoCliente = procedimentoRepository.buscaProcedimentoPorCliente(idCliente);
		log.info("[finish] ProcedimentoApplicationService -  buscaProcedimentosPorCliente");
		return ProcedimentoResponse.converte(procedimentosDoCliente);
	}
}