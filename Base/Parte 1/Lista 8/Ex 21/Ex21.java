import java.util.Scanner;

public class Ex21 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 10)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve estar entre 1 e 10. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		int vetor2[] = new int[quantidadeDeElementos];
		
		System.out.print("\n\n - - -> LEITURA DE VETOR < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Entre com o elemento [ %d ] : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			if((vetor[posicao] % 2) == 0){
				
				vetor2[posicao] = vetor[posicao];
				
			} else {
				
				vetor2[posicao] = vetor[posicao] * 2;
				
			}
			
		}
		
		System.out.print("\n\n - - -> VETOR DE PARES: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor2[posicao]);
			
		}
		
	}	
}
