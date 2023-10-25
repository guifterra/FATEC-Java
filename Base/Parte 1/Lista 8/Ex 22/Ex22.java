import java.util.Scanner;
import java.util.Random;

public class Ex22 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int quantidadeDeElementos, elementoMax;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			System.out.print("\n Entre com o valor maximo dos elementos: ");
			elementoMax = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 20)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve estar entre 1 e 20. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		
		System.out.print("\n\n - - -> LEITURA DE VETOR < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			vetor[posicao] = gerador.nextInt((elementoMax + 1));
			
		}
		
		System.out.print("\n\n - - -> VETOR RANDOMICO: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
