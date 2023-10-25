import java.util.Scanner;
import java.util.Random;

public class Ex24 {
	
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
		int a = 0, b = 1, c = 0;
		
		System.out.print("\n\n - - -> MATRIZ DE FIBONACCI GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = a;
				
				c = a + b;
				a = b;
				b = c;
				
				System.out.printf(" [ %d ]", matriz[i][j]);	
			}
			System.out.println("\n");
		}
	}
}
