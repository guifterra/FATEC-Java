import java.util.Scanner;

public class PerfeitosAte900{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux = 2, soma, i;
		
		System.out.print("\n - - -> Numeros perfeitos ate 900: \n\n");
		
		while(aux <= 900){
			
			soma = 0;
			
			for(i = 1; i < aux; i++){
				
				if((aux % i) == 0)
					soma += i;
				
			}
			
			if (soma == aux)
				System.out.print(" " + aux);
			
			
			aux++;
		}
	}
}
