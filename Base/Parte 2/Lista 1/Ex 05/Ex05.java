import java.util.Scanner;
import java.util.Random;

public class Ex05 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int A[][], B[][], C[][], linha, coluna, limiteDoRandom;
		
		while(true){
			
			System.out.print("\n Entre com a dimensao da linha.: ");
			linha = leia.nextInt();
			
			System.out.print("\n Entre com a dimensao da coluna: ");
			coluna = leia.nextInt();
			
			System.out.print("\n Entre com a max valor de randomicos: ");
			limiteDoRandom = leia.nextInt();
			
			if((linha > 1) && ((coluna > 1)))
				break;
			
		}
		A = new int[linha][coluna];
		B = new int[linha][coluna];
		C = new int[linha][coluna];
		
		for(int i = 0; i < A.length; i++){
			
			for(int j = 0; j < A[i].length; j++){
				
				A[i][j] = gerador.nextInt(limiteDoRandom + 1);
				B[i][j] = gerador.nextInt(limiteDoRandom + 1);
				C[i][j] = A[i][j] + B[i][j];
				
			}
		}
		
		System.out.print("\n - - -> A MATRIZ 1: \n\n");
		
		for(int i = 0; i < A.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < A[i].length; j++){
				
				System.out.printf(" [ %d ] ", A[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.print("\n - - -> A MATRIZ 2: \n\n");
		
		for(int i = 0; i < B.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < B[i].length; j++){
				
				System.out.printf(" [ %d ] ", B[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.print("\n - - -> A MATRIZ RESULTANTE (1 + 2): \n\n");
		
		for(int i = 0; i < C.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < C[i].length; j++){
				
				System.out.printf(" [ %d ] ", C[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
