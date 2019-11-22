
public class Canal {

	Integer canalAtual = 130;
	
	void mudarCanal(Integer novoCanal) {
		
		if (canalAtual.equals(novoCanal)) {
			System.out.println("Canal atual.");
		} else {
			canalAtual = novoCanal;
			System.out.println("Canal alterado para " + canalAtual);
		}
		
	}
	
}
