
public class VetoresMaisQue2Dimensao01 {
	
	public static void main(String[] args) {
		
		Integer[] semanaUm = new Integer[] {11, 12, 13, 14, 15, 16, 17};
		Integer[] semanaDois = new Integer[] {21, 22, 23, 24, 25, 26, 27};
		Integer[] semanaTres = new Integer[] {31, 32, 33, 34, 35, 36, 37};
		Integer[] semanaQuatro = new Integer[] {41, 42, 43, 44, 45, 46, 47};
		
		Integer[][] mes = new Integer[][] {semanaUm, semanaDois, semanaTres, semanaQuatro};
		
		Integer[][][] ano = new Integer[][][] {mes};
		
		Integer[][][][] cincoAnos = new Integer [][][][] {ano};
		
		Integer[][][][][] dezAnos = new Integer [][][][][] {cincoAnos};
		
		for (int a = 0; a < dezAnos.length; a++) {
			
			System.out.println("Vetor dezAnos: " + a);
			Integer[][][][] vetor4dimensoes = dezAnos[a];
			
			for (int b = 0; b < vetor4dimensoes.length ; b++) {

				System.out.println("Vetor cincoAnos: " + b);
				Integer[][][] vetor3dimensoes = vetor4dimensoes[b];
				
				for (int c = 0; c < vetor3dimensoes.length; c++) {
					
					System.out.println("Vetor ano: " + c);
					Integer[][] vetor2dimensoes = vetor3dimensoes[c];
					
					for (int d = 0 ; d < vetor2dimensoes.length; d++) {
						
						System.out.println("Vetor mês: " + d);
						Integer[] vetor1dimensao = vetor2dimensoes[d];
						
						for (int e = 0; e < vetor1dimensao.length; e++)
							 
							System.out.println("valor: " + vetor1dimensao[e]);
						
					}
				}
				
			}
			
		}
		
		
		
		
	}
}
