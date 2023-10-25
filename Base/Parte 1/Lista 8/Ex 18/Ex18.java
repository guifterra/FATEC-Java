import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeElementos;
		
		while(true){
			
			System.out.print("\n Entre com a quantidade de elementos: ");
			quantidadeDeElementos = leia.nextInt();
			
			if((quantidadeDeElementos >= 1) && (quantidadeDeElementos <= 15)){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valor invalido ! O valor deve estar entre 1 e 15. \n");
				
			}
			
		}
		
		long vetor[] = new long[quantidadeDeElementos];
		int aux = 1;
		long fat;
		
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			fat = 1;
			
			for(int i = 1; i <= aux; i++)
				fat *= i;
			
			vetor[posicao] = fat;
			
			aux++;
			
		}
		
		System.out.print("\n - - -> VETOR COM SEQ DE FATORIAIS: \n");
		for(int posicao = 0; posicao < vetor.length; posicao++){
			
			System.out.printf("\n\t Vetor [ %d ] = %d \n", posicao, vetor[posicao]);
			
		}
		
	}	
}
