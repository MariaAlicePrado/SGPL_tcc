package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Ocorrencia;
import sgpl.model.Usuario;
import sgpl.repository.OcorrenciaRepository;

import java.util.List;

@Service
public class OcorrenciaServiceImpl implements OcorrenciaService  {

    private OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaServiceImpl(OcorrenciaRepository ocorrenciaRepository) {

        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    @Override
    public Ocorrencia inserir(Ocorrencia ocorrencia) {

        return null;
    }

    @Override
    public Ocorrencia salvar(Ocorrencia ocorrencia) {
        return null;
    }

    @Override
    public Ocorrencia findById(Long id) {
        return null;
    }

    @Override
    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }
}