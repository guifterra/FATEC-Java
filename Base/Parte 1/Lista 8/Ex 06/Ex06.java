import java.util.Scanner;

public class Ex06 {
	
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
		boolean vetor3[] = new boolean[quantidadeDeElementos];
		
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
		
		System.out.print("\n\n - - -> OBS \n");
		for(int posicao = 0; posicao < vetor3.length; posicao++){
			
			vetor3[posicao] = (vetor1[posicao] == vetor2[posicao])? true : false ;
			
			if(vetor3[posicao]){
				
				System.out.printf("\n\t Vetores na posicao [ %d ] - Sao iguais ! \n ", posicao);
				
			} else {
				
				System.out.printf("\n\t Vetores na posicao [ %d ] - NAO sao iguais \n ", posicao);
				
			}
			
			
		}
		
	}
}
