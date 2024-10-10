package sgpl.services;

import sgpl.model.Ocorrencia;
import java.util.List;

public interface OcorrenciaService {

        public Ocorrencia inserir(Ocorrencia ocorrencia);
        public Ocorrencia salvar(Ocorrencia ocorrencia);
        public Ocorrencia findById(Long id);


    List<Ocorrencia> findAll();
}
