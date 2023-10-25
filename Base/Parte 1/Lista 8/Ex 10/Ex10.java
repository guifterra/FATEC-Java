import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int tamanhoPa = 5;
		int tamanhoPb = 5;
		int tamanhoPc = tamanhoPa + tamanhoPb;
		
		int PA[] = new int[tamanhoPa];
		int PB[] = new int[tamanhoPb];
		int PC[] = new int[tamanhoPc];
		
		System.out.print("\n\n - - -> LEITURA DE VETOR Pa < - - - \n");
		for(int posicao = 0; posicao < tamanhoPa; posicao++){
			
			System.out.printf("\n\t Entre com o elemento %d : ", posicao);
			PA[posicao] = leia.nextInt();
			
		}
		
		System.out.print("\n\n - - -> LEITURA DE VETOR Pb < - - - \n");
		for(int posicao = 0; posicao < tamanhoPb; posicao++){
			
			System.out.printf("\n\t Entre com o elemento %d : ", posicao);
			PB[posicao] = leia.nextInt();
			
		}
		
		for(int posicao = 0; posicao < tamanhoPb; posicao++){
			
			PC[posicao] = PA[posicao];
			PC[posicao + 5] = PB[posicao];
			
		}
		
		System.out.print("\n\n - - -> Impressao DE VETOR Pc \n");
		for(int posicao = 0; posicao < tamanhoPc; posicao++){
			
			System.out.printf("\n\t Elemento [ %d ] = %d \n", posicao, PC[posicao]);
			
		}
		
	}
}
