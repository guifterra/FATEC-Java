import java.util.Scanner;
import java.util.Random;

public class Ex27 {
	
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
		
		for(int a = 0 ; a < matriz.length; a++){
			
				for(int i = 0; i < matriz[a].length; i++){
					
					menor = matriz[a][i];
					
					for(int j = i + 1; j < matriz[a].length; j++){
							
						if(menor > matriz[a][j]){
							
							int aux;
							aux = menor;
							menor = matriz[a][j];
							matriz[a][j] = aux;
							
						}
					}
					
					matriz[a][i] = menor;
				}
			}
		
		// --------------
		
		System.out.print("\n\n - - -> MATRIZ ORDENADA (SO LINHAS): \n\n");
		for(int i = 0; i < matriz.length; i++){
				
			for(int j = 0; j < matriz[i].length; j++){
					
				System.out.printf(" [ %02d ]", matriz[i][j]);	
			}
			System.out.println("\n");
		}

}
}
