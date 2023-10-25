import java.util.Scanner;

public class TesteMaiorMenorQ10 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura de numero
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		// teste
		if (numero > 10){
			
			System.out.print("\n O NUMERO EH MAIOR DO QUE 10");
			
		} else {
		
			System.out.print("\n O NUMERO NAO EH MAIOR DO QUE 10");
		
		}
		
	}
}
