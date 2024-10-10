package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgpl.model.Ocorrencia;
import sgpl.services.OcorrenciaService;
import java.util.List;

@RestController
@RequestMapping("/ocorrencia/")
public class OcorrenciaController {

    final OcorrenciaService ocorrenciaService;
    public OcorrenciaController(OcorrenciaService ocorrenciaService) {

        this.ocorrenciaService = ocorrenciaService;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Ocorrencia>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Ocorrencia> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findById(id));
    }

}


