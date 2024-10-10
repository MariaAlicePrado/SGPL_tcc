package sgpl.services;

import sgpl.model.Historico;

import java.util.List;

public interface HistoricoService {
    Historico inserir(Historico historico);

    Historico salvar(Historico historico);

    List<Historico> findAll();

    Historico findById(long id);
}
