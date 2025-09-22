package sgpl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sgpl.model.Ocorrencia;
import sgpl.model.Usuario;

@Repository
public interface OcorrenciaRepository extends JpaRepository <Ocorrencia, Long> {
	List<Ocorrencia> findByStatusOcorrencia(String statusOcorrencia);
	
	List<Ocorrencia> findByProfessorAndStatusOcorrencia(Usuario professor, String statusOcorrencia);
}
