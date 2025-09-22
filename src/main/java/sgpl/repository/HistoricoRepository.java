package sgpl.repository;

import sgpl.model.Historico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sgpl.model.Ocorrencia;

import java.util.List;

@Repository
public interface HistoricoRepository extends JpaRepository <Historico, Long> {

    List<Historico> findByOcorrencia(Ocorrencia ocorrencia);

}