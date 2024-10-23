package sgpl.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sgpl.model.Usuario;
import sgpl.services.UsuarioService;
import sgpl.services.UsuarioServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/usuario/")
@CrossOrigin(origins = "*")
public class UsuarioController {

    final UsuarioServiceImpl usuarioService;

    public UsuarioController(UsuarioServiceImpl usuarioService) {

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

    @PostMapping("findByRm")
    public ResponseEntity<Usuario> findByRm(@PathVariable Usuario usuario) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.findByRm(usuario.rm));
    }

    @PutMapping("inativar/{id}")
    public ResponseEntity<Usuario> inativar(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.inativar(id));
    }

    @PutMapping("reativar/{id}")
    public ResponseEntity<Usuario> reativar(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.reativar(id));
    }

    @PutMapping("alterar/{id}")
    public ResponseEntity<Usuario> alterar(@PathVariable Long id,  @RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(usuarioService.alterarUsuario(id, usuario));
    }

    @PostMapping("signin")
    public ResponseEntity<Usuario> signin(@RequestParam String rm, @RequestParam String senha) {
        System.out.println("TST");
        Usuario usuario = usuarioService.signin(rm, senha);

        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        return ResponseEntity.ok(usuario);
    }

    @PostMapping("create")
    public  ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.create(usuario));
    }


}


