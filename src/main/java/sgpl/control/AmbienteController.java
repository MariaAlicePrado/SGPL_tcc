package sgpl.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sgpl.model.Ambiente;
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


    @PutMapping("inativar/{id}")
    public ResponseEntity<Ambiente> inativar(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ambienteService.inativar(id));
    }

    @PutMapping("reativar/{id}")
    public ResponseEntity<Ambiente> reativar(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ambienteService.reativar(id));
    }

    @PutMapping("alterarAmbiente/{id}")
    public ResponseEntity<Ambiente> alterar(@PathVariable Long id,  @RequestBody Ambiente ambiente) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ambienteService.alterarAmbiente(id, ambiente));
    }
    
    @PostMapping("create")
    public  ResponseEntity<Ambiente> create(@RequestBody Ambiente ambiente) {
        return ResponseEntity.status(HttpStatus.OK).body(ambienteService.create(ambiente));
    }

}

