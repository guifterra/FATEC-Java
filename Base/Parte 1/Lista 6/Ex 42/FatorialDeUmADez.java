import java.util.Scanner;

public class FatorialDeUmADez {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux, numero;
		long fatorial;
		
		for (aux = 1; aux <= 10; aux++){
			
			fatorial = 1;
			numero = 1;
			
			while (true) {
				
				if (numero == (aux + 1))
					break;
				
				fatorial *= numero;
				
				numero++;
			}
			
			System.out.printf("\n O fatorial de %02d e: %7d \n", aux, fatorial);
		}
		
	}
}
