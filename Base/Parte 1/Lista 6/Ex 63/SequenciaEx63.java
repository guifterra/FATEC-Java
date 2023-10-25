import java.util.Scanner;

public class SequenciaEx63 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int quantidadeAtual = 1;
		
		double a = 2, b = 1, soma = 0, A = 0, B = 1, primo = 2, aux, condicao;
		
		System.out.print("\n - - -> Sequencia: ");
		while (quantidadeAtual <= quantidadeTermos) {
			
			a = A + B;
			B = A;
			A = a;
			
			while(true){
				
				condicao = 0;
				
				for(aux = 1; aux <= primo; aux++){
					if ((primo % aux) == 0)
						condicao++;
				}
				
				if(condicao == 2){
					
					b = primo;
					primo++;
					break;
				}
				
				primo++;
			}
			
			System.out.printf(" %.2f", (a / b));
			
			soma += (a/b);
			
			if (quantidadeAtual != quantidadeTermos)	
					System.out.print(" +");
			
			quantidadeAtual++;
		}
		
		System.out.printf("\n\n - - -> Soma: %.2f", soma);
		
	}
}
