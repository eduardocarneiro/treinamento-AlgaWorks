package bibliotecaemail;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {

	public static void main(String[] args) throws EmailException {
		
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		
		
		int i = 0;
		while(true) {
		
			System.out.print("Digite a tarefa[" + i + "]: ");
			String tarefa = scanner.nextLine();
			
			Boolean validaTarefaDigitadaPeloUsuario = tarefa.equals("x"); 
			
			if (validaTarefaDigitadaPeloUsuario) {
				break;
			} else {
				linhas.add(tarefa);
			}
			i++;
		}
		
		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n"; // Repare aqui a quebra de linha.
		}

		//System.out.println(tarefas);
		
		String mensagem = "Suas tarefas: \n" + tarefas;
		
		System.out.print("Digite e-mail de destino: ");
		String para = scanner.next();
		
		Exercicio01EnviaEmail.EnviarEmail(para, "Lista de tarefas2", mensagem);
		System.out.println("E-mail enviado com sucesso.");
		
		//System.out.println(para);
		//System.out.println(mensagem);
		
		/*
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
		
		*/
		scanner.close();

	}

}
