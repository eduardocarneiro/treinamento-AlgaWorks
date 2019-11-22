
public class Volume {

	Integer volumeAtual = 20;
	
	void mudarVolume(Integer novoVolume) {
		if (volumeAtual.equals(novoVolume)) {
			System.out.print("Volume atual.");
		} else {
			volumeAtual = novoVolume;
			System.out.println("Volume alterado para: " + volumeAtual);
		}	
	}
}
