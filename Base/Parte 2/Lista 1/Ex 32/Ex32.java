import java.util.Scanner;
import java.util.Random;

public class Ex32 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
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
		
		matriz = new int[linhas + 1][colunas + 1];
		
		for(int i = 0; i < matriz.length - 1; i++){
			
			int somaDasColunas = 0;
			
			for(int j = 0; j < matriz[i].length - 1; j++){
				
				matriz[i][j] = gerador.nextInt(20 + 1);
				somaDasColunas += matriz[i][j];
			}
			
			matriz[i][matriz[i].length - 1] = somaDasColunas;
		}
		
		for(int j = 0; j < matriz[0].length - 1; j++){
			
			int somaDasLinhas = 0;
			
			for(int i = 0; i < matriz.length - 1; i++){
				
				somaDasLinhas += matriz[i][j];
				
			}
			matriz[matriz.length - 1][j] = somaDasLinhas;
		}
		
		int somaDiagPrincipal = 0;
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				if(i == j)
					somaDiagPrincipal += matriz[i][j];
				
			}
		}
		matriz[matriz.length -1][matriz[0].length - 1] = somaDiagPrincipal;
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf(" [ %02d ]", matriz[i][j]);
			}
			System.out.println("\n");
		}
		
	}
}
