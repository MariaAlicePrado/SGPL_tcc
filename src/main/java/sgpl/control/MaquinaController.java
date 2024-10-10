package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgpl.model.Maquina;
import sgpl.services.MaquinaService;
import java.util.List;

@RestController
@RequestMapping("/maquina/")
public class MaquinaController {

    final MaquinaService maquinaService;
    public MaquinaController(MaquinaService maquinaService) {
        this.maquinaService = maquinaService;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Maquina>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(maquinaService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Maquina> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(maquinaService.findById(id));
    }

}


