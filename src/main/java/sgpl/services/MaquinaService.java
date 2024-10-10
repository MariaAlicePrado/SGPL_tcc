package sgpl.services;

import sgpl.model.Maquina;

import java.util.List;

public interface MaquinaService {
    Maquina inserir(Maquina maquina);

    Maquina salvar(Maquina ocorrencia);

    List<Maquina> findAll();

    Maquina findById(long id);
}
