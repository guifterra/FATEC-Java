import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int G[] = new int[5];
		int soma = 0, quantidadeDePares = 0;
		
		System.out.print("\n - - -> LEITURA DO VETOR < - - - \n");
		for(int posicao = 0; posicao <= 4; posicao++){
			
			System.out.printf("\n\t Entre com o elemento %d : ", posicao);
			G[posicao] = leia.nextInt();
			
			if(((G[posicao]) % 2) == 0)
				quantidadeDePares++;
		}
		
		if(quantidadeDePares != 0){
			
			int H[] = new int[quantidadeDePares];
			
			int aux = 0;
			for(int posicao = 0; posicao < H.length; posicao++){
				
				while(true){
					
					if(G[aux] % 2 == 0){
						
						H[posicao] = G[aux];
						aux++;
						break;
						
					}
					
					aux++;
					
				}
			}
			
			System.out.print("\n\n - - -> NOVO VET COM PARES < - - - \n");
			for(int posicao = 0; posicao < H.length; posicao++){
				
				System.out.printf("\n\t Novo vetor [ %d ] = %d", posicao, H[posicao]);
			}
			
		} else {
			
			System.out.print("\n O vetor nao possui elementos pares !");
			
		}
		
	}
}
