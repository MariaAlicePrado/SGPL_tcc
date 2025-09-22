package sgpl.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import sgpl.model.Ocorrencia;
import sgpl.model.Usuario;
import sgpl.repository.OcorrenciaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    @Transactional
    public Ocorrencia salvar(Ocorrencia ocorrencia) {

        ocorrencia.setDataOcorrencia(LocalDateTime.now());
        ocorrencia.setStatusOcorrencia("ABERTA");

        return ocorrenciaRepository.save(ocorrencia);
    }

    @Override
    public Ocorrencia findById(Long id) {
        return ocorrenciaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

	@Override
	public Ocorrencia resolver(Long id, Ocorrencia ocorrencia) {
		Optional<Ocorrencia> _ocorrencia =  ocorrenciaRepository.findById(id);
		 if(_ocorrencia.isPresent()){
			 Ocorrencia ocorrenciaBD = _ocorrencia.get();
			 
			 ocorrenciaBD.setResolucao(ocorrencia.getResolucao());
			 ocorrenciaBD.setStatusOcorrencia("CONCLUÍDA");
			 
			 return ocorrenciaRepository.save(ocorrenciaBD);     
		 }
		return null;
	}

	@Override
	public List<Ocorrencia> findAllAberta() {
		return ocorrenciaRepository.findByStatusOcorrencia("ABERTA");
	}

	@Override
	public List<Ocorrencia> findAllConcluida() {
		return ocorrenciaRepository.findByStatusOcorrencia("CONCLUÍDA");
	}

	@Override
	public List<Ocorrencia> findAllConcluidaProf(Usuario professor) {
		return ocorrenciaRepository.findByProfessorAndStatusOcorrencia(professor, "CONCLUÍDA");
	}

	@Override
	public List<Ocorrencia> findAllAbertaProf(Usuario professor) {
		return ocorrenciaRepository.findByProfessorAndStatusOcorrencia(professor, "ABERTA");
	}
	


}