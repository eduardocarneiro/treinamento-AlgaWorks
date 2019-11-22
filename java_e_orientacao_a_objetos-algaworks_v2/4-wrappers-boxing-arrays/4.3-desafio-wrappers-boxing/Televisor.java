import java.util.Scanner;

public class Televisor {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("Digite o novo canal: ");
		Integer canalEntrada = c.nextInt();
		
		Scanner v = new Scanner(System.in);
		System.out.print("Digite o novo volume: ");
		Integer volumeEntrada = v.nextInt();
		
		Canal canal = new Canal();
		canal.mudarCanal(canalEntrada);
	
		Volume volume = new Volume();
		volume.mudarVolume(volumeEntrada);
		
	}
}
