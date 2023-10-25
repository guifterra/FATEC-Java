import java.util.Scanner;

public class XNumerosPerfeitos {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int quantidadeAtual = 1, soma, aux = 2, i;
		
		System.out.print("\n - - -> Sequencia de " + quantidadeTermos + " termos perfeitos: \n\n");
		
		while(quantidadeAtual <= quantidadeTermos){
			
			soma = 0;
			
			for(i = 1; i < aux; i++){
				
				if((aux % i) == 0)
					soma += i;
				
			}
			
			if (soma == aux){
				
				System.out.print(" " + aux);
				quantidadeAtual++;
				
			}
			
			aux++;
			
		}
		
	}
}
