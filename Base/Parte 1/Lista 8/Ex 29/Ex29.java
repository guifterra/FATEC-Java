import java.util.Scanner;
import java.util.Random;

public class Ex29 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int quantidadeDeElementos;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 10)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve ser maior que 10. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			vetor[posicao] = gerador.nextInt(101);
			
			if(posicao != 0){
				
				for(int teste = posicao - 1; teste >= 0; teste--){
					
					if(vetor[posicao] == vetor[teste]){
						
						posicao--;
						break;
						
					}
				}
				
			}
		}
		
		System.out.print("\n\n - - -> CHUTE UM VALOR (Vc tem 10 tentativas): \n");
		
		int chute, sair = 0;
		for(int i = 1; i <= 10; i++){
			
			System.out.print("\n Entre com o seu palpite: ");
			chute = leia.nextInt();
			
			for(int posicao = 0; posicao < vetor.length; posicao++){
				
				if(chute == vetor[posicao]){
					
					System.out.print("\n Parabens vc acertou um dos valores! ");
					
					System.out.print("\n\n - - -> VETOR DE RANDOMICO: \n");
					for(int posicaoaux = 0; posicaoaux < vetor.length; posicaoaux++){
						
						System.out.printf("\n\t Vetor [ %d ] = %d \n", posicaoaux, vetor[posicaoaux]);
						
					}
					sair = 1;
					break;
		
				}
			}
			if(sair == 1)
				break;
				
			System.out.print("\n\t Erro ! Tente novamente. \n");
		}
		
	}	
}
