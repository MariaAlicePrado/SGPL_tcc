package sgpl.services;

import org.springframework.stereotype.Service;
import sgpl.model.Ambiente;
import sgpl.repository.AmbienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AmbienteServiceImpl implements AmbienteService  {

    private AmbienteRepository ambienteRepository;

    public AmbienteServiceImpl(AmbienteRepository ambienteRepository) {

        this.ambienteRepository = ambienteRepository;
    }

    @Override
    public Ambiente create(Ambiente ambiente) {
        return ambienteRepository.save(ambiente);
    }

    @Override
    public Ambiente salvar(Ambiente ambiente) {
        return null;
    }

    @Override
    public List<Ambiente> findAll() {
        return ambienteRepository.findAll();
    }

    @Override
    public Ambiente findById(long id) {
        return ambienteRepository.findById(id).get();
    }
    
    @Override
    public Ambiente alterarAmbiente(Long id, Ambiente ambiente){
        Optional<Ambiente> _ambiente =  ambienteRepository.findById(id);

        if(_ambiente.isPresent()){
            Ambiente ambienteid = _ambiente.get();

            ambienteid.setNome(ambiente.getNome());
            ambienteid.setLocalAmbiente(ambiente.getLocalAmbiente());

            return ambienteRepository.save(ambienteid);
        }

        return null;
    }

    @Override
    public Ambiente inativar(Long id){
        Optional<Ambiente> _ambiente =  ambienteRepository.findById(id);

        if(_ambiente.isPresent()){
            Ambiente ambienteid = _ambiente.get();

            ambienteid.setStatusAmbiente("INATIVO");

            return ambienteRepository.save(ambienteid);
        }

        return null;
    }

    @Override
    public Ambiente reativar(Long id){
        Optional<Ambiente> _ambiente =  ambienteRepository.findById(id);

        if(_ambiente.isPresent()){
            Ambiente ambienteid = _ambiente.get();

            ambienteid.setStatusAmbiente("ATIVO");

            return ambienteRepository.save(ambienteid);
        }

        return null;
    }

}