import java.util.Scanner;
import java.util.Random;

public class Ex04 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int matriz[][], linha, coluna, limiteDoRandom;
		
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
		matriz = new int[linha][coluna];
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(limiteDoRandom + 1);
				
			}
		}
		
		System.out.print("\n - - -> A MATRIZ gerada foi: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf(" [ %d ] ", matriz[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
