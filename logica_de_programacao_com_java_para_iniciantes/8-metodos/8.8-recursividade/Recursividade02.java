
public class Recursividade02 {

	public static void main(String[] args) {
		
		String[] alunos = new String[] {"Eduardo", "Dezenatty", "Sarah" };
		
		Integer numero = 0;
		iteracaoAlunos(alunos, numero);
	}
	
	static void iteracaoAlunos(String[] alunos, Integer i) {
		
		// Utilizando o "for"
		//for (int i = 0; i < alunos.length; i++) {
		//	System.out.println(alunos[i]);
		//}
		
		//Utilizando Recursividade
		if (i < alunos.length) {
			System.out.println(alunos[i]);
			iteracaoAlunos(alunos, ++i);
		}
	}
}
