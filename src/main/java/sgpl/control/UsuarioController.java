package sgpl.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sgpl.model.Usuario;
import sgpl.services.EmailService;
import sgpl.services.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario/")
@CrossOrigin(origins = "*")
public class UsuarioController {

	private final UsuarioServiceImpl usuarioService;
	private final EmailService emailService;

	public UsuarioController(UsuarioServiceImpl usuarioService, EmailService emailService) {
		super();
		this.usuarioService = usuarioService;
		this.emailService = emailService;
	}

	@GetMapping("findAll")
	public ResponseEntity<List<Usuario>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
	}

	@GetMapping("findById/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable long id) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findById(id));
	}

	@PostMapping("findByRm")
	public ResponseEntity<Usuario> findByRm(@PathVariable Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findByRm(usuario.rm));
	}

	@PutMapping("inativar/{id}")
	public ResponseEntity<Usuario> inativar(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.inativar(id));
	}

	@PutMapping("reativar/{id}")
	public ResponseEntity<Usuario> reativar(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.reativar(id));
	}

	@PutMapping("alterarUsuario/{id}")
	public ResponseEntity<Usuario> alterar(@PathVariable Long id, @RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.alterarUsuario(id, usuario));
	}

	@PostMapping("signin")
	public ResponseEntity<Usuario> signin(@RequestParam String rm, @RequestParam String senha) {
		Usuario usuario = usuarioService.signin(rm, senha);

		if (usuario == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}

		return ResponseEntity.ok(usuario);
	}

	@PostMapping("create")
	public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.create(usuario));
	}

}
