
public class ListaAlunos {

	static final int QUANTIDADE_LISTA = 2;
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	void adicionarAluno(Aluno aluno) {
		
		if (tamanhoLista == lista.length) {
			
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
			lista = novaLista;
			
		}
		
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
 	
}
