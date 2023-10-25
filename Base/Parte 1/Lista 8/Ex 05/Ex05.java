import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos = 0;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 15))
				break;
				
			System.out.print("\n\t Valor invalido ! Inserir valor de 1 a 15. \n");
			
		}
		
		int vetor1[] = new int[quantidadeDeElementos];
		int vetor2[] = new int[quantidadeDeElementos];
		int vetor3[] = new int[quantidadeDeElementos];
		
		System.out.print("\n\n - - -> LEITURA VETOR 1 < - - - \n");
		for(int posicao = 0; posicao < vetor1.length; posicao++){
			
			System.out.print("\n\t Entre com o elemento " + posicao + " : ");
			vetor1[posicao] = leia.nextInt();
			
		}
		
		System.out.print("\n\n - - -> LEITURA VETOR 2 < - - - \n");
		for(int posicao = 0; posicao < vetor2.length; posicao++){
			
			System.out.print("\n\t Entre com o elemento " + posicao + " : ");
			vetor2[posicao] = leia.nextInt();
			
		}
		
		System.out.print("\n\n - - -> VETOR RESULTANT \n");
		for(int posicao = 0; posicao < vetor3.length; posicao++){
			
			vetor3[posicao] = vetor1[posicao] + vetor2[posicao];
			System.out.printf("\n\t Vetor [ %d ] = %d \n ", posicao, vetor3[posicao]);
			
		}
		
	}
}
