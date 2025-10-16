package sgpl.control;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sgpl.services.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;
    
    public EmailController(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	@PostMapping("/enviar-codigo")
    public String enviarCodigo(@RequestParam String email) {
        return emailService.enviarCodigoAcesso(email);
    }
}

