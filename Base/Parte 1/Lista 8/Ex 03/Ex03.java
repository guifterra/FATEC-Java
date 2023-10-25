import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos = 0;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos do vetor: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && ( quantidadeDeElementos <= 20))
				break;
				
			System.out.print("\n\t Valor invalido! Por favor, entre com um valor de 1 a 20. \n");
			
		}
		
		int vetor[] = new int[quantidadeDeElementos];
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Ente com o valor %d : ", posicao);
			vetor[posicao] = leia.nextInt();
			
		}
		
		System.out.print("\n\n - - -> Vetor: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n Vetor [ %d ] = %d ", posicao, vetor[posicao]);
			
		}
	}
}
