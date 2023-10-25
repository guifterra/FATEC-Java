import java.util.Scanner;
import java.util.Random;

public class Ex07 {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		Scanner leia = new Scanner ( System.in );
		
		int matriz[][], linha, coluna, maior, menor;
		
		System.out.print("\n Entre com a quantidade de linhas da matriz.: ");
		linha = leia.nextInt();
		
		System.out.print("\n Entre com a quantidade de colunas da matriz: ");
		coluna = leia.nextInt();
		
		matriz = new int[linha][coluna];
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(100);
				
			}
		}
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				System.out.printf(" [ %02d ]", matriz[i][j]);
				
			}
			System.out.println("\n");
		}
		
		menor = matriz[0][0];
		maior = matriz[0][0];
		
		String posicaoDoMenor = "";
		String posicaoDoMaior = "";
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				if(menor >= matriz[i][j]){
					
					menor = matriz[i][j];
					posicaoDoMenor = "[ " + i + " ] [ " + j + " ]";
					
				}
				
				if(maior <= matriz[i][j]){
					
					maior = matriz[i][j];
					posicaoDoMaior = "[ " + i + " ] [ " + j + " ]";
					
				}
				
			}
		}
		
		System.out.print("\n\n - - -> RESULTADO: \n\n");
		System.out.print(" Menor Valor: " + menor);
		System.out.print("\n Posicao: " + posicaoDoMenor);
		
		System.out.print("\n\n Maior Valor: " + maior);
		System.out.print("\n Posicao: " + posicaoDoMaior);
		
	}
}
