import java.util.Scanner;

public class Ex19 {
	
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
		int aux = 1;
		long fat;
		
		System.out.print("\n\n - - -> LEITURA DE VETOR < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Entre com o elemento [ %d ] : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		int menor, rotativa = 0;
		aux = 0;
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			menor = vetor[posicao];
			
			for(int i = vetor.length - 1; i > (0 + aux); i--){
				
				if(menor > vetor[i]){
					
					rotativa = menor;
					menor = vetor[i];
					vetor[i] = rotativa;
					
				}
			}
			
			vetor[posicao] = menor;
			aux++;
		}
		
		System.out.print("\n\n - - -> VETOR ORDENADO: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
