import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		
		int matriz[][];
		matriz = new int[4][5];
		
		System.out.print("\n - - -> MATRIZ 4x5: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf("\n Entre com o elemento [ %d ] [ %d ] da matriz: ", i, j);
				matriz[i][j] = leia.nextInt();
				
			}
			System.out.println();
		}
		
		System.out.print("\n - - -> A MATRIZ 4x5 gerada foi: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.print(" [ " + matriz[i][j] + " ] ");
				
			}
			System.out.println();
		}
		
	}
}
