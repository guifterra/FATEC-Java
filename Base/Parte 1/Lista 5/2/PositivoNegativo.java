import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura de numero
		System.out.print("\n Entre com um numero: ");
		int numero = leia.nextInt();
		
		// teste
		if (numero >= 0){
			
			System.out.print("\n O NUMERO EH POSITIVO");
			
		} else {
		
			System.out.print("\n O NUMERO EH NEGATIVO");
		
		}
		
	}
}
