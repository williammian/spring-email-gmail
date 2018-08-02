package br.com.wm.email;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.wm.email.envio.Mailer;
import br.com.wm.email.envio.Mensagem;

public class SpringEmailMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringEmailMain.class.getPackage().getName());
		
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("William Teste <williammian@gmail.com>", 
				Arrays.asList("Testes <william_mian@yahoo.com.br>")
				, "Spring E-mail", "Olá! \n\n O envio de e-mail deu certo!"));
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}

}
