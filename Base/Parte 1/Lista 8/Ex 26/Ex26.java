import java.util.Scanner;

public class Ex26 {
	
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
		
		// Ordena impares
		int aux = 0, menor, rotativa, posicaoDoUltimoImPar = 0, vezesQueFoiDivisivel, vezesQueFoiDivisivel2;
		for(int posicao= 0; posicao < vetor.length; posicao++){
			
			vezesQueFoiDivisivel = 0;
			menor = vetor[posicao];
			
			for(int help2 = 1; help2 <= vetor[posicao]; help2++){
				
				if(vetor[posicao] % help2 == 0)
					vezesQueFoiDivisivel++;
				
			}
			
			if(vezesQueFoiDivisivel == 2){
				
				for(int i = posicao + 1; i < vetor.length; i++){
					
					vezesQueFoiDivisivel2 = 0;
					
					for(int help2 = 1; help2 <= vetor[i]; help2++){
				
						if(vetor[i] % help2 == 0)
							vezesQueFoiDivisivel2++;
						
					}
					
					if((menor > vetor[i]) && (vezesQueFoiDivisivel2 == 2)){
						
						rotativa = menor;
						menor = vetor[i];
						vetor[i] = rotativa;
					}
				}
				
				posicaoDoUltimoImPar = posicao;
				
				if((vetor[aux] % 2) == 0){
					
					rotativa = vetor[aux];
					vetor[aux] = menor;
					vetor[posicaoDoUltimoImPar] = rotativa;
					
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
