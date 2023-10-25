import java.util.Scanner;
import java.util.Random;

public class Ex08_Lista3 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		System.out.print("\n ENTRADA: \n");
		
		int quantidadeDeVezesJogadas = 1000000;
		int limite = 1;
		int[] vetor = new int[6];
		
		while(limite <= quantidadeDeVezesJogadas){
			
			int resultadoDoDado = dado();
			
			vetor[resultadoDoDado - 1] = vetor[resultadoDoDado - 1] + 1;
			
			limite++;
			
		}
		
		for(int i = 0; i < vetor.length; i++){
			
			System.out.printf("\n\t %d : %6d - %.2f ", (i + 1), vetor[i], ((double)vetor[i] / quantidadeDeVezesJogadas * 100));
			
		}
		
		System.out.print("\n\n\t Fim do programa . . . \n");
			
	}
	
	static int dado(){
		
		Random gerador = new Random();
		int resultado = gerador.nextInt(6); 
		return resultado + 1;
		
	}
}
