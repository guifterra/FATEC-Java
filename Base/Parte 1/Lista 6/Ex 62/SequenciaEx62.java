import java.util.Scanner;

public class SequenciaEx62 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int quantidadeAtual = 1;
		
		double a = 2, b = 1, soma = 0;
		boolean sinalPositivo = true;
		
		System.out.print("\n - - -> Sequencia: ");
		while (quantidadeAtual <= quantidadeTermos) {
			
			System.out.printf(" %.2f", (a / b));
			
			if (sinalPositivo){
					
					soma += (a/b);
					
			} else {
					
					soma -= (a/b);
					
			}
	
			a += 2;
			b += 2;
			
			sinalPositivo = !sinalPositivo;
			
			if (quantidadeAtual != quantidadeTermos){
				if (sinalPositivo){
					
					System.out.print(" +");
					
				} else {
					
					System.out.print(" -");
					
				}
			}
			
			quantidadeAtual++;
		}
		
		System.out.printf("\n\n - - -> Soma: %.2f", soma);
		
	}
}
