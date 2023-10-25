import java.util.Scanner;
import java.util.Random;

public class Ex10 {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		Scanner leia = new Scanner ( System.in );
		
		int matriz[][], dimensao;
		
		System.out.print("\n Entre com a dimensao da matriz quadrada: ");
		dimensao = leia.nextInt();
		
		matriz = new int[dimensao][dimensao];
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(100);
				System.out.printf(" [ %02d ]", matriz[i][j]);
				
			}
			System.out.println("\n");
		}
		
		System.out.print("\n\n - - -> ELEMENTOS DA DIAGONAL SECUN: ");
		for(int i = 0; i < matriz.length; i++){
			
				System.out.printf(" [ %02d ]", matriz[i][matriz.length -1 - i]);
			
		}

	}
}
