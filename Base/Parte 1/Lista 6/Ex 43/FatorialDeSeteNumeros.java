import java.util.Scanner;

public class FatorialDeSeteNumeros {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux, numero, aux2;
		long fatorial;
		
		for (aux = 1; aux <= 7; aux++){
			
			System.out.print("\n Entre com um numero: ");
			numero = leia.nextInt();
			
			aux2 = numero;
			fatorial = 1;
			
			while(true) {
				
				if (aux2 == 1)
					break;
					
				fatorial *= aux2;
				aux2--;
			}
			
			System.out.printf("\n O fatorial de %d e: %d \n", numero, fatorial);
		}
		
	}
}
