package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sgpl.model.Ocorrencia;
import sgpl.model.Usuario;
import sgpl.services.OcorrenciaService;
import java.util.List;

@RestController
@RequestMapping("/ocorrencia/")
public class OcorrenciaController {

    final OcorrenciaService ocorrenciaService;
    public OcorrenciaController(OcorrenciaService ocorrenciaService) {

        this.ocorrenciaService = ocorrenciaService;
    }

    @PostMapping("create")
    public  ResponseEntity<Ocorrencia> create(@RequestBody Ocorrencia ocorrencia) {
        return ResponseEntity.status(HttpStatus.OK).body(ocorrenciaService.salvar(ocorrencia));
    }


    @GetMapping("findAll")
    public ResponseEntity<List<Ocorrencia>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAll());
    }
    
    @GetMapping("findAllAberta")
    public ResponseEntity<List<Ocorrencia>> findAllAberta() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAllAberta());
    }
    
    @GetMapping("findAllConcluida")
    public ResponseEntity<List<Ocorrencia>> findAllConcluida() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAllConcluida());
    }
    
    @GetMapping("findAllAbertasProf")
    public ResponseEntity<List<Ocorrencia>> findAllAbertaProf(@RequestParam Usuario professor) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAllAbertaProf(professor));
    }
    
    @GetMapping("findAllConcluidasProf")
    public ResponseEntity<List<Ocorrencia>> findAllConcluidaProf(@RequestParam Usuario professor) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findAllConcluidaProf(professor));
    }
    
   
    @GetMapping("findAllConcluidaProf/{professorId}")
    public ResponseEntity<List<Ocorrencia>> getOcorrenciasConcluidasPorProfessor(@PathVariable Long professorId) {
        Usuario professor = new Usuario();
        professor.setId(professorId);

        List<Ocorrencia> ocorrencias = ocorrenciaService.findAllConcluidaProf(professor);

        if (ocorrencias.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(ocorrencias);
    }
    
    @GetMapping("findAllAbertaProf/{professorId}")
    public ResponseEntity<List<Ocorrencia>> getOcorrenciasAbertasPorProfessor(@PathVariable Long professorId) {
        Usuario professor = new Usuario();
        professor.setId(professorId);

        List<Ocorrencia> ocorrencias = ocorrenciaService.findAllAbertaProf(professor);

        if (ocorrencias.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(ocorrencias);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Ocorrencia> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ocorrenciaService.findById(id));
    }
    
    @PutMapping("resolver/{id}")
    public  ResponseEntity<Ocorrencia> resolver(@PathVariable long id, @RequestBody Ocorrencia ocorrencia) {
        return ResponseEntity.status(HttpStatus.OK).body(ocorrenciaService.resolver(id, ocorrencia));
    }

}


