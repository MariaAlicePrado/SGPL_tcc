package sgpl.services;

import sgpl.model.Ocorrencia;
import sgpl.model.Usuario;

import java.util.List;

public interface OcorrenciaService {

        public Ocorrencia inserir(Ocorrencia ocorrencia);
        public Ocorrencia salvar(Ocorrencia ocorrencia);
        public Ocorrencia findById(Long id);
        public Ocorrencia resolver(Long id, Ocorrencia ocorrencia);

        List<Ocorrencia> findAll();
        List<Ocorrencia> findAllAberta();
        List<Ocorrencia> findAllConcluida();
        List<Ocorrencia> findAllConcluidaProf(Usuario professor);
        List<Ocorrencia> findAllAbertaProf(Usuario professor);

}
