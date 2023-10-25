import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 20)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve estar entre 1 e 20. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		int quantidadeDeDivisoesPossiveis, aux = 1;
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			while(true){
				
				quantidadeDeDivisoesPossiveis = 0;
				
				for(int i = 1; i <= aux; i++){
					
					if((aux % i) == 0){
						quantidadeDeDivisoesPossiveis++;
					}
				}
				
				if(quantidadeDeDivisoesPossiveis == 2)
					break;
				
				aux++;
			}
			
			vetor[posicao] = aux;
			aux++;
			
		}
		
		System.out.print("\n - - -> VETOR COM SEQ DE PRIMOS: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
