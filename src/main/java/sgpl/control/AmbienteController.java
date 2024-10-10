package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgpl.model.Ambiente;
import sgpl.services.AmbienteService;
import java.util.List;

@RestController
@RequestMapping("/ambiente/")
public class AmbienteController {

    final AmbienteService ambienteService;
    public AmbienteController(AmbienteService ambienteService) {
        this.ambienteService = ambienteService;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Ambiente>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ambienteService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Ambiente> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ambienteService.findById(id));
    }

}


