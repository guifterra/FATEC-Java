import java.util.Scanner;

public class SequenciaEx65 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeTermos = leia.nextInt();
		
		int quantidadeAtual = 1;
		
		double a = 2, b = 1, soma = 0, primo = 2, aux, condicao, fat, numero = 0, i;
		boolean sinalPositivo = false;
		
		System.out.print("\n - - -> Sequencia: ");
		while (quantidadeAtual <= quantidadeTermos) {
			
			while(true){
				
				fat = 1;
				
				for(i = 1; i<= numero; i++)
					fat *= i;
					
				if (numero == 0){
					
					a = -1;
					numero++;
					break;
					
					
				} else {
					
					a = fat;
					numero++;
					break;
					
				}
				
			}
			
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
			
			if (sinalPositivo || a < 0){
					
					soma += (a/b);
					
			} else {
					
					soma -= (a/b);
					
			}
			
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
