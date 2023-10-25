import java.util.Scanner;
import java.util.Locale;

public class SequenciaEx39 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int quantidadeDeNumero = 0, quantidadePositiva = 0;
		double aux = 1, aux2 = 0, soma = 0;
		
		while (true) {
			
			if (quantidadeDeNumero <= 0){
				
				System.out.print("\n Entre com a quantidade de numeros: ");
				quantidadeDeNumero = leia.nextInt();
				
				quantidadePositiva = quantidadeDeNumero;
				aux2 = quantidadeDeNumero;
				
				if (quantidadeDeNumero == 0) {
					System.out.print("\n Fim do programa . . . ! \n");
					break;
				}
				
				if (quantidadeDeNumero < 0)
					System.out.print("\n Valor Invalido! \n");
					
			} else {
				
				System.out.printf(" %.2f", (aux / aux2));
				
				soma += (aux / aux2);
				
				aux++;
				aux2--;
				
				quantidadePositiva--;
				
				if (quantidadePositiva <= 0)
					break;
				
				System.out.print(",");
			}
			
			
			
		}
		
		System.out.printf("\n\n Soma dos numeros: %.2f", soma);
		
	}
}
