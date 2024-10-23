package sgpl.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sgpl.model.Usuario;

import java.util.List;

public class ControllerPadrao<Tipo> {
    JpaRepository<Tipo, Long> repository;


    ControllerPadrao(JpaRepository<Tipo, Long> repository) {
        this.repository = repository;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Tipo>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(repository.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Tipo> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(repository.findById(id).get());
    }

    @PostMapping("create")
    public  ResponseEntity<Tipo> create(@RequestBody Tipo entidade) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(entidade));
    }

    @PostMapping("alterar/{id}")
    public  ResponseEntity<Tipo> alterar(@PathVariable long id, @RequestBody Tipo entidade) {

        return ResponseEntity.status(HttpStatus.OK).body(repository.save(entidade));
    }

}
