package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Historico;
import sgpl.repository.HistoricoRepository;

import java.util.List;

@Service
public class HistoricoServiceImpl implements HistoricoService  {

    private HistoricoRepository historicoRepository;

    public HistoricoServiceImpl(HistoricoRepository historicoRepository) {

        this.historicoRepository = historicoRepository;
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
}