import java.util.Scanner;
import java.util.Random;

public class Ex06 {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		Scanner leia = new Scanner( System.in );
		
		int linha, coluna, matriz[][], numero;
		
		System.out.print("\n Entre com a quantidade de linahs da matriz: ");
		linha = leia.nextInt();
		
		System.out.print("\n Entre com a quantidade de coluna da matriz: ");
		coluna = leia.nextInt();
		
		System.out.print("\n Entre com um numero para verificae se esta na matriz: ");
		numero = leia.nextInt();
		
		matriz = new int[linha][coluna];
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(25);
				
			}
		}
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf(" [ %02d ]", matriz[i][j]);
				
			}
			System.out.println("\n");
		}
		
		int quantidadeRepetidas = 0;
		System.out.print("\n\n - - -> RESULTADO: \n\n");
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				if((matriz[i][j]) == numero){
					
					quantidadeRepetidas++;
					System.out.printf(" O numero %d aparece em [ %d ] [ %d ] da matriz ! ", numero, i , j);
					System.out.println("\n");
				}
			}
			
		}
		
		if(quantidadeRepetidas == 0)
			System.out.printf("\n O numero %d NAO aparece na matriz ! ", numero);
	}
}
