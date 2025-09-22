package sgpl.services;

import sgpl.model.Ambiente;

import java.util.List;

public interface AmbienteService {

	 public Ambiente create(Ambiente ambiente);
	 public Ambiente salvar(Ambiente ocorrencia);

    List<Ambiente> findAll();

    Ambiente findById(long id);

	Ambiente alterarAmbiente(Long id, Ambiente ambiente);
	
	Ambiente inativar(Long id);
	
	Ambiente reativar(Long id);
}
