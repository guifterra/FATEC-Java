import java.util.Scanner;

public class SequenciaEx61 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int quantidadeAtual = 1;
		
		double a = 2, b = 1, soma = 0;
		
		System.out.print("\n - - -> Sequencia: ");
		while (quantidadeAtual <= quantidadeTermos) {
			
			System.out.printf(" %.2f", (a / b));
			
			soma += (a/b);
			a += 2;
			b += 2;
			
			if (quantidadeAtual != quantidadeTermos)
				System.out.print(" +");
			
			quantidadeAtual++;
		}
		
		System.out.printf("\n\n - - -> Soma: %.2f", soma);
		
	}
}
