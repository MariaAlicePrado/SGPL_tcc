package control;

import model.Professor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import services.ProfessorService;

import java.util.List;

@RestController
@CrossOrigin(origins="*", maxAge = 3600, allowCredentials = "false")
@RequestMapping("/produto")
public class ProfessorController {

    final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    /*@PostMapping
    public ResponseEntity<Object> saveProduto(@RequestBody Professor produto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(professorService.save(produto));
    }

    @GetMapping
    public ResponseEntity<List<Professor>> getAllProdutos(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(professorService.findAll());*/
    }


