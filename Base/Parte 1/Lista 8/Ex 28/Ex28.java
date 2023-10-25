import java.util.Scanner;
import java.util.Random;

public class Ex28 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int quantidadeDeElementos;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 25)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve ser maior que 1 e 25. \n");
				
			}
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		int vetorRandom[] = new int[(gerador.nextInt(4) + 2)];
		
		System.out.print("\n\n - - -> LEITURA DE VETOR < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Entre com o elemento %d : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		for(int posicao = 0; posicao < vetorRandom.length; posicao++){
			
			vetorRandom[posicao] = gerador.nextInt(2);
			
		}
		
		System.out.print("\n\n - - -> VETOR DE RANDOMICO: \n");
		for(int posicao = 0; posicao < vetorRandom.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetorRandom[posicao]);
			
		}
		
		int aux, inicioDoIntervaloRepetido = -1;
		
		for(int posicao = 0; posicao < vetor.length - vetorRandom.length + 1; posicao++){
			
			aux = 0;
			
			for(int i = posicao; i < (posicao + vetorRandom.length); i++){
				
				if(vetor[i] == vetorRandom[aux]){
					aux++;
				} else {
					break;
				}
			}
			
			if(aux == vetorRandom.length){
				System.out.printf("\n O vetor Randomico esta contido no vetor em: [ %d : %d ] ", posicao, (posicao + vetorRandom.length - 1));
				inicioDoIntervaloRepetido = 0;
				
			}
		}
		
		if(inicioDoIntervaloRepetido == -1){
			
			System.out.print("\n Erro ! O vetor Randomico n esta contido no vetor.");
			
		}
		
	}	
}
