package sgpl.services;

import java.util.Random;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import sgpl.model.Usuario;

@Service
public class EmailService {

    private final JavaMailSender mailSender;
    
    public EmailService(JavaMailSender mailSender) {
		super();
		this.mailSender = mailSender;
	}

	public String enviarCodigoAcesso(String destinatario) {
        String codigo = gerarCodigo();
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setTo(destinatario);
        mensagem.setSubject("Seu código de acesso");
        mensagem.setText("Olá! Seu código de acesso é: " + codigo);
        mailSender.send(mensagem);
        return codigo;
    }
	
	public String enviarMensagemPorEmail(String email, String rm, String senha) {
        String codigo = gerarCodigo();
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setTo(email);
        mensagem.setSubject("Você foi cadastrado no Sistema SGPL");
        mensagem.setText("Olá! Seu código de acesso é: \n" + 
        					"RM: " + rm +"\n"+ 
        					"Senha: " + senha);
        mailSender.send(mensagem);
        return codigo;
    }


    private String gerarCodigo() {
        Random random = new Random();
        int codigo = 100000 + random.nextInt(900000); // Gera um código de 6 dígitos
        return String.valueOf(codigo);
    }
}

