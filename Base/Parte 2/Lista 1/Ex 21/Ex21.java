import java.util.Scanner;
import java.util.Random;

public class Ex21 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int linhas, colunaDaMatriz1, colunaDaMatriz2;
		
		do{
			System.out.print("\n Entre com a quantidade de linha das matrizes: ");
			linhas = leia.nextInt();
			
		}while(linhas <= 1);
		
		do{
			System.out.print("\n Entre com a quantidade de colunas da matriz 1: ");
			colunaDaMatriz1 = leia.nextInt();
			
		}while(colunaDaMatriz1 <= 1);
		
		do{
			System.out.print("\n Entre com a quantidade de colunas da matriz 2: ");
			colunaDaMatriz2 = leia.nextInt();
			
		}while(colunaDaMatriz2 <= 1);
		
		int[][] matriz1, matriz2, matrizResultante;
		
		matriz1 = new int[linhas][colunaDaMatriz1];
		matriz2 = new int[linhas][colunaDaMatriz2];
		matrizResultante = new int[linhas][colunaDaMatriz1 + colunaDaMatriz2];
		
		System.out.print("\n\n - - -> MATRIZ 1 GERADA: \n\n");
		for(int i = 0; i < matriz1.length; i++){
			
			for(int j = 0; j < matriz1[i].length; j++){
				
				matriz1[i][j] = gerador.nextInt(20 + 1);
				System.out.printf(" [ %02d ]", matriz1[i][j]);
				
			}
			System.out.println("\n");
		}
		
		System.out.print("\n - - -> MATRIZ 2 GERADA: \n\n");
		for(int i = 0; i < matriz2.length; i++){
			
			for(int j = 0; j < matriz2[i].length; j++){
				
				matriz2[i][j] = gerador.nextInt(20 + 1);
				System.out.printf(" [ %02d ]", matriz2[i][j]);
				
			}
			System.out.println("\n");
		}
		
		System.out.print("\n - - -> MATRIZES CONCATENADAS: \n\n");
		for(int i = 0; i < matrizResultante.length; i++){
			
			for(int j = 0; j < matrizResultante[i].length; j++){
				
				
				if((j <= (matriz1[i].length - 1))){
					
					matrizResultante[i][j] = matriz1[i][j];
					
				}else{
					
					matrizResultante[i][j] = matriz2[i][j - matriz2[i].length + 1];
				}
				
				System.out.printf(" [ %02d ]", matrizResultante[i][j]);
				
			}
			System.out.println("\n");
		}
		
	}
}
