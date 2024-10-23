package sgpl.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sgpl.model.Ambiente;
import sgpl.services.AmbienteService;
import java.util.List;

@RestController
@RequestMapping("/ambiente/")
@CrossOrigin(origins = "*")
public class AmbienteController extends ControllerPadrao<Ambiente> {

    final AmbienteService ambienteService;
    public AmbienteController(JpaRepository<Ambiente, Long> repository, AmbienteService ambienteService) {
        super(repository);
        this.ambienteService = ambienteService;

    }


}


