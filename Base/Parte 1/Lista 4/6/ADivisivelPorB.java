import java.util.Scanner;

public class ADivisivelPorB {

	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura de valores
		System.out.print("\n Entre com o primeiro valor (Entre 0 e 1000): ");
		int a = leia.nextInt();
		
		// Leitura de valores
		System.out.print("\n Entre com o segundo valor (Entre 0 e 20): ");
		int b = leia.nextInt();
		
		// Validacao
		if ((a >= b) && ((a >= 0) && (a <= 1000)) && ((b >= 0) && (b <= 20))){
		
			// a eh divisivel por b?
			if ((a % b) == 0){
				
				System.out.printf("\n a (%d) EH divisivel por b (%d)", a, b);
				
				} else {
				
				System.out.printf("\n a (%d) NAO eh divisivel por b (%d)", a, b);
			}
		
			} else {
		
			System.out.print("\n ERRO: Os valores inseridos estao fora dos limites ou o numero 1 e menor q o numero 2!");
		
		}
		
	}	
}
