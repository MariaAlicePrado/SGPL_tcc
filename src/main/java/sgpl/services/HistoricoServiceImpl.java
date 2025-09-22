package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Historico;
import sgpl.model.Ocorrencia;
import sgpl.repository.HistoricoRepository;
import sgpl.repository.OcorrenciaRepository;

import java.util.List;

@Service
public class HistoricoServiceImpl implements HistoricoService  {

    private final OcorrenciaRepository ocorrenciaRepository;
    private HistoricoRepository historicoRepository;

    public HistoricoServiceImpl(HistoricoRepository historicoRepository, OcorrenciaRepository ocorrenciaRepository) {

        this.historicoRepository = historicoRepository;
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    @Override
    public Historico inserir(Historico historico) {
        return null;
    }

    @Override
    public Historico salvar(Historico historico) {
        return null;
    }

    @Override
    public List<Historico> findAll() {
        return historicoRepository.findAll();
    }

    @Override
    public Historico findById(long id) {
        return historicoRepository.findById(id).get();
    }

    @Override
    public List<Historico> findByOcorrenciaId(long idOcorrencia) {
        Ocorrencia ocorrencia = ocorrenciaRepository.findById(idOcorrencia).get();
        return historicoRepository.findByOcorrencia(ocorrencia);
    }
}