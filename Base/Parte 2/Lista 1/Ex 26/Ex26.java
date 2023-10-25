import java.util.Scanner;
import java.util.Random;

public class Ex26 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner( System.in );
		Random gerador = new Random();
		
		int linhas, colunas, matriz[][];
		
		do{
			
			System.out.print("\n Entre com a quantidade de linhas: ");
			linhas = leia.nextInt();
			
		}while(linhas <= 1);
		
		do{
			
			System.out.print("\n Entre com a quantidade de colunas: ");
			colunas = leia.nextInt();
			
		}while(colunas <= 1);
		
		matriz = new int[linhas][colunas];
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(20 + 1);
				
				System.out.printf(" [ %02d ]", matriz[i][j]);	
			}
			System.out.println("\n");
			
		}
		
		// --------------
		int maior;
		
		for(int a = 0; a < matriz.length; a++){
			
			for(int b = 0; b < matriz[a].length; b++){
				
				maior = matriz[a][b];
				int aux2 = b;
				
				for(int i = 0 + a; i < matriz.length; i++){
						
					for(int j = 0 + aux2; j < matriz[i].length; j++){
							
						if(maior < matriz[i][j]){
							
							int aux;
							aux = maior;
							maior = matriz[i][j];
							matriz[i][j] = aux;
							
						}
					}
					aux2 = 0;
				}
				
				matriz[a][b] = maior;
			}
		}
		
		// --------------
		
		System.out.print("\n\n - - -> MATRIZ ORDENADA (DECRESCENTE: \n\n");
		for(int i = 0; i < matriz.length; i++){
				
			for(int j = 0; j < matriz[i].length; j++){
					
				System.out.printf(" [ %02d ]", matriz[i][j]);	
			}
			System.out.println("\n");
		}
}
}
