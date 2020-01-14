package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Exercicio01EnviaEmail {

	static void EnviarEmail (String para, String assunto, String msg) throws EmailException {
	
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ecarneiro.redhat", "senha"));
		email.setSSLOnConnect(true);
		email.setFrom("ecarneiro.redhat@gmail.com");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();
		
	}
}
