package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ecarneiro.redhat", "senha"));
		email.setSSLOnConnect(true);
		email.setFrom("ecarneiro.redhat@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("eduardo.oc@gmail.com");
		email.send();
		System.out.println("E-mail enviado com sucesso!");

	}

}
