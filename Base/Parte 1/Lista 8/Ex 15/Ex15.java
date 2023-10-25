import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int tamanhoPa;
		int tamanhoPb;
		
		while(true){
			
			System.out.print("\n Entre com o tamanho do vetor 1: ");
			tamanhoPa = leia.nextInt();
			
			System.out.print("\n Entre com o tamanho do vetor 2: ");
			tamanhoPb = leia.nextInt();
			
			if(((tamanhoPa >= 1) && (tamanhoPa <= 10)) && ((tamanhoPb >= 1) && (tamanhoPb <= 15))){
				
				break;
				
			} else {
				
				System.out.print("\n\t Valores invalidos ! Entre com valores de:\n\t 1 a 10 para v1\n\t e de\n\t 1 a 15 para v2. \n");
				
			}
			
		}
		
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
		
		int menor, maior;
		if(tamanhoPa > tamanhoPb){
			
			menor = tamanhoPb;
			maior = tamanhoPa;
			
		} else {
			
			menor = tamanhoPa;
			maior = tamanhoPb;
			
		}
		
		int posicaoAux = 0;
		for(int posicao = 0; posicao < menor; posicao ++){
			
			PC[posicaoAux] = PA[posicao];
			PC[posicaoAux + 1] = PB[posicao];
			
			posicaoAux += 2;
			
		}
		
		int aux = 0;
		for(int posicao = menor; posicao < maior; posicao ++){
			
			PC[(menor * 2) + aux] = (tamanhoPa > tamanhoPb)? PA[posicao]: PB[posicao];
			aux++;
		}
		
		System.out.print("\n\n - - -> Impressao DE VETOR Pc \n");
		for(int posicao = 0; posicao < tamanhoPc; posicao++){
			
			System.out.printf("\n\t Elemento [ %d ] = %d \n", posicao, PC[posicao]);
			
		}
		
	}
}
