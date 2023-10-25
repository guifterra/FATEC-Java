import java.util.Scanner;
import java.util.Random;

public class Ex22 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int linhas, colunasDaMatriz1, colunasDaMatriz2;
		
		do{
			
			System.out.print("\n Entre com a quantidade de linhas: ");
			linhas = leia.nextInt();
			
		}while(linhas < 1);
		
		do{
			
			System.out.print("\n Entre com a quantidade de colunas da M1: ");
			colunasDaMatriz1 = leia.nextInt();
			
		}while(colunasDaMatriz1 < 1);
		
		do{
			
			System.out.print("\n Entre com a quantidade de colunas da M2: ");
			colunasDaMatriz2 = leia.nextInt();
			
		}while(colunasDaMatriz2 < 1);
		
		int[][] matriz1, matriz2, matrizResultante;
		
		matriz1 = new int[linhas][colunasDaMatriz1];
		matriz2 = new int[linhas][colunasDaMatriz2];
		matrizResultante = new int[linhas][colunasDaMatriz1 + colunasDaMatriz2];
		
		System.out.print("\n\n - - -> MATRIZ 1 GERADA: \n\n");
		for(int i = 0; i < matriz1.length; i++){
					
			for(int j = 0; j < matriz1[i].length; j++){
				
				matriz1[i][j] = gerador.nextInt(20 + 1);
				System.out.printf(" [ %02d ]", matriz1[i][j]);
			}
			System.out.println("\n");
		}
		
		System.out.print("\n\n - - -> MATRIZ 2 GERADA: \n\n");
		for(int i = 0; i < matriz2.length; i++){
					
			for(int j = 0; j < matriz2[i].length; j++){
				
				matriz2[i][j] = gerador.nextInt(20 + 1);
				System.out.printf(" [ %02d ]", matriz2[i][j]);
			}
			System.out.println("\n");
		}
		
		System.out.print("\n\n - - -> MATRIZ RESULTANTE: \n\n");
		for(int i = 0; i < matrizResultante.length; i++){
			
				int j = 0, aux = 0, aux2 = 0;
				while(j < matrizResultante[i].length){
					
					if(aux < matriz1[i].length){
						matrizResultante[i][j] = matriz1[i][aux];
						System.out.printf(" [ %02d ]", matrizResultante[i][j]);
						aux++;
						j++;
					}
					
					if(aux2 < matriz2[i].length){
						matrizResultante[i][j] = matriz2[i][aux2];
						System.out.printf(" [ %02d ]", matrizResultante[i][j]);
						aux2++;
						j++;
					}
					
				}
				System.out.println("\n");
			
		}
	}
}
