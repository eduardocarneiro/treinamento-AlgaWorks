import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		Integer primeiroValor = scanner.nextInt();
		
		System.out.print("Operação desejada: [1 - adição ; 2 - subtração ; 3 - multiplicação ; 4 - divisão]");
		Integer operacaoDesejada = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		Integer segundoValor = scanner.nextInt();
		
		Boolean adicao = operacaoDesejada.equals(1);
		Boolean subtracao = operacaoDesejada.equals(2);
		Boolean multiplicacao = operacaoDesejada.equals(3);
		Boolean divisao = operacaoDesejada.equals(4);
		
		if (adicao) {		
			Integer calculoAdicao = primeiroValor + segundoValor;
			System.out.println("Adição: " + primeiroValor + " + " + segundoValor + " = " + calculoAdicao);
			
		} else if (subtracao) {
			Integer calculoSubtracao = primeiroValor - segundoValor;
			System.out.println("Subtração: " + primeiroValor + " - " + segundoValor + " = " + calculoSubtracao);
			
		} else if (multiplicacao) {
			Integer calculoMultiplicacao = primeiroValor * segundoValor;
			System.out.println("Multiplicação: " + primeiroValor + " * " + segundoValor + " = " + calculoMultiplicacao);
			
		} else if (divisao) {
			Integer calculoDivisao = primeiroValor / segundoValor;
			System.out.println("Divisão: " + primeiroValor + " / " + segundoValor + " = " + calculoDivisao);
			
		}
		
		scanner.close();
		
	}
}
