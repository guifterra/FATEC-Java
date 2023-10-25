import java.util.Scanner;
import java.util.Random;

public class Ex03 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int matriz[][], dimensao;
		
		while(true){
			
			System.out.print("\n Entre com a dimensao da matriz quadrada: ");
			dimensao = leia.nextInt();
			
			if((dimensao >= 1) && (dimensao <= 20))
				break;
			
		}
		matriz = new int[dimensao][dimensao];
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(101);
				
			}
		}
		
		System.out.print("\n - - -> A MATRIZ gerada foi: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			System.out.print("\t");
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf(" [ %03d ] ", matriz[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
