package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Ambiente;
import sgpl.repository.AmbienteRepository;
import java.util.List;

@Service
public class AmbienteServiceImpl implements AmbienteService  {

    private AmbienteRepository ambienteRepository;

    public AmbienteServiceImpl(AmbienteRepository ambienteRepository) {

        this.ambienteRepository = ambienteRepository;
    }

    @Override
    public Ambiente inserir(Ambiente ambiente) {
        return null;
    }

    @Override
    public Ambiente salvar(Ambiente ambiente) {
        return null;
    }

    @Override
    public List<Ambiente> findAll() {
        return ambienteRepository.findAll();
    }

    @Override
    public Ambiente findById(long id) {
        return ambienteRepository.findById(id).get();
    }
}