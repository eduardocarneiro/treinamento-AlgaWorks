
public class AlgoritmosAvancados {

	public static void main(String[] args) {
	
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Eduardo";
		lista.adicionarAluno(aluno);

		aluno = new Aluno();
		aluno.nome = "Natty";
		lista.adicionarAluno(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Sarah";
		lista.adicionarAluno(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Joaquim";
		lista.adicionarAluno(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Joaninha";
		lista.adicionarAluno(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Benjamin";
		lista.adicionarAluno(aluno);

		aluno = new Aluno();
		aluno.nome = "Natal";
		lista.adicionarAluno(aluno);
		
		for (int i = 0 ; i < lista.tamanho() ; i++) {
			
			Aluno a = lista.obter(i);
			System.out.println("Aluno[ " + i + "]: " + a.nome);
		}
	}
}
