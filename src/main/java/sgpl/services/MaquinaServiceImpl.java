package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Maquina;
import sgpl.model.Usuario;
import sgpl.repository.MaquinaRepository;

import java.util.Base64;
import java.util.Date;
import java.util.List;

@Service
public class MaquinaServiceImpl implements MaquinaService  {

    private MaquinaRepository maquinaRepository;

    public MaquinaServiceImpl(MaquinaRepository maquinaRepository) {

        this.maquinaRepository = maquinaRepository;
    }

    @Override
    public Maquina inserir(Maquina maquina) {
        return null;
    }


    @Override
    public Maquina salvar(Maquina ocorrencia) {
        return null;
    }

    @Override
    public List<Maquina> findAll() {
        return maquinaRepository.findAll();
    }

    @Override
    public Maquina findById(long id) {
        return maquinaRepository.findById(id).get();
    }
}
