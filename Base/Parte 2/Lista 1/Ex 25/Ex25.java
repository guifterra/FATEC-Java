import java.util.Scanner;
import java.util.Random;

public class Ex25 {
	
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
		int menor;
		
		for(int a = 0; a < matriz.length; a++){
			
			for(int b = 0; b < matriz[a].length; b++){
				
				menor = matriz[a][b];
				int aux2 = b;
				
				for(int i = 0 + a; i < matriz.length; i++){
						
					for(int j = 0 + aux2; j < matriz[i].length; j++){
							
						if(menor > matriz[i][j]){
							
							int aux;
							aux = menor;
							menor = matriz[i][j];
							matriz[i][j] = aux;
							
						}
					}
					aux2 = 0;
				}
				
				matriz[a][b] = menor;
			}
		}
		
		// --------------
		
		System.out.print("\n\n - - -> MATRIZ ORDENADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
				
			for(int j = 0; j < matriz[i].length; j++){
					
				System.out.printf(" [ %02d ]", matriz[i][j]);	
			}
			System.out.println("\n");
		}
}
}
