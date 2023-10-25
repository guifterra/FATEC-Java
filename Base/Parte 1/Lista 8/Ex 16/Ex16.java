import java.util.Scanner;

public class Ex16 {
	
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
		int a = 0, b = 1, c;
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			vetor[posicao] = a;
			
			c = a + b;
			a = b;
			b = c;
			
		}
		
		System.out.print("\n - - -> VETOR COM SEQ DE FIBONACCI: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
