import java.util.Scanner;

public class Ex23 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos, elementoMax;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve ser maior que 1. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		
		System.out.print("\n\n - - -> LEITURA DE VETOR < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Entre com o elemento %d : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		int aux = 0, menor, rotativa, posicaoDoUltimoPar = 0;
		for(int posicao= 0; posicao < vetor.length; posicao++){
			
			menor = vetor[posicao];
			
			if(vetor[posicao] % 2 == 0){
				
				for(int i = posicao + 1; i < vetor.length; i++){
					
					if((menor > vetor[i]) && (vetor[i] % 2 == 0)){
						
						rotativa = menor;
						menor = vetor[i];
						vetor[i] = rotativa;
					}
				}
				
				posicaoDoUltimoPar = posicao;
				
				if((vetor[aux] % 2) != 0){
					
					rotativa = vetor[aux];
					vetor[aux] = menor;
					vetor[posicaoDoUltimoPar] = rotativa;
					
				} else {
					
					vetor[aux] = menor;
					
				}
				
				aux++;
			}
		}
		
		System.out.print("\n\n - - -> VETOR DE PARES ORDENADOS: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
