package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sgpl.model.Usuario;
import sgpl.services.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

    final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {

        this.usuarioService = usuarioService;
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.findAll());
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.findById(id));
    }

}


