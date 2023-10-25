import java.util.Scanner;
import java.util.Random;

public class Ex28 {
	
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
		
		for(int a = 0 ; a < matriz[0].length; a++){
			
				for(int i = 0; i < matriz.length; i++){
					
					menor = matriz[i][a];
					
					for(int j = i + 1; j < matriz.length; j++){
							
						if(menor > matriz[j][a]){
							
							int aux;
							aux = menor;
							menor = matriz[j][a];
							matriz[j][a] = aux;
							
						}
					}
					
					matriz[i][a] = menor;
				}
			}
		
		// --------------
		
		System.out.print("\n\n - - -> MATRIZ ORDENADA (SO COLUNAS): \n\n");
		for(int i = 0; i < matriz.length; i++){
				
			for(int j = 0; j < matriz[i].length; j++){
					
				System.out.printf(" [ %02d ]", matriz[i][j]);	
			}
			System.out.println("\n");
		}

}
}
