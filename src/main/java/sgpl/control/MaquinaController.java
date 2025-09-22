package sgpl.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sgpl.model.Ambiente;
import sgpl.model.Maquina;
import sgpl.model.Usuario;
import sgpl.services.AmbienteService;
import sgpl.services.MaquinaService;
import java.util.List;

@RestController
@RequestMapping("/maquina/")
@CrossOrigin(origins = "*")
public class MaquinaController extends ControllerPadrao<Maquina> {

    final MaquinaService maquinaService;

    final AmbienteService ambienteService;
    public MaquinaController(JpaRepository<Maquina, Long> repository, MaquinaService maquinaService, AmbienteService ambienteService) {
        super(repository);
        this.maquinaService = maquinaService;
        this.ambienteService = ambienteService;
    }

    @Override
    @PostMapping("create")
    public ResponseEntity<Maquina> create(Maquina entidade) {
        entidade.setStatusMaquina("ATIVA");
        return super.create(entidade);
    }
}


