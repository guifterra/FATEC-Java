import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos = 0;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 20))
				break;
				
			System.out.print("\n\t Valor invalido ! A quantidade deve estar entre 1 e 20. \n");
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		int maior, menor;
		
		System.out.print("\n\n - - -> LEITURA DO VET < - - - \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Entre com o elemento %d : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		menor = vetor[0];
		maior = vetor[0];
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			if(menor > vetor[posicao])
				menor = vetor[posicao];
				
			if(maior < vetor[posicao])
				maior = vetor[posicao];
		}
		
		System.out.print("\n\n O menor valor do vetor e: " + menor);
		System.out.print("\n O maior valor do vetor e: " + maior);
		
	}
}
