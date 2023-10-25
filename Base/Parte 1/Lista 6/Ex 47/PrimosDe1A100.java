import java.util.Scanner;

public class PrimosDe1A100 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux = 1, condicao, i;
		
		System.out.print("\n - - -> Sequencia de Numeros Primos de 1 a 100: \n\n");
		
		while (aux <= 100){
			
			condicao = 0;
			
			for (i = aux; i >= 1; i--){
				
				if ((aux % i) == 0)
					condicao++;
				
			}	
			
			if (condicao == 2)
				System.out.printf(" %d", aux);
			
			aux++;
			
			if ((aux != 98) && (condicao == 2))
				System.out.print(",");
		}
	}
}
