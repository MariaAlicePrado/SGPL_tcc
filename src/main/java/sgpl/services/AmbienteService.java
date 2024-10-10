package sgpl.services;

import sgpl.model.Ambiente;

import java.util.List;

public interface AmbienteService {

    Ambiente inserir(Ambiente ambiente);

    Ambiente salvar(Ambiente ambiente);

    List<Ambiente> findAll();

    Ambiente findById(long id);
}
