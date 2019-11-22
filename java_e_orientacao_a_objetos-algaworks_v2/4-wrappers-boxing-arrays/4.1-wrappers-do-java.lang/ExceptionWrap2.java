import java.awt.font.NumericShaper;

public class ExceptionWrap2 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt("8");
		System.out.println(a);
			
		try {
			int b = Integer.parseInt("oito");
			System.out.println(b);
			
		} catch (NumberFormatException e) {
			System.err.println("numero nao valido!");
		}
			
		
	}
}
