package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgpl.model.Historico;
import sgpl.services.HistoricoService;

import java.util.List;

@RestController
@RequestMapping("/historico/")
public class HistoricoController {

    final HistoricoService historicoService;
    public HistoricoController(HistoricoService historicoService) {
        this.historicoService = historicoService;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Historico>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(historicoService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Historico> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(historicoService.findById(id));
    }

}


