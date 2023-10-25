import java.util.Scanner;
import java.util.Random;

public class Ex08 {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		Scanner leia = new Scanner ( System.in );
		
		int matriz[][], linhas, colunas;
		
		System.out.print("\n Entre com a quantidade de linhas.: ");
		linhas = leia.nextInt();
		
		System.out.print("\n Entre com a quantidade de colunas: ");
		colunas = leia.nextInt();
		
		matriz = new int[linhas][colunas];
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				matriz[i][j] = gerador.nextInt(100);
				System.out.printf(" [ %02d ]", matriz[i][j]);
				
			}
			System.out.println("\n");
		}
		
		int quantidadePares = 0, quantidadeImpares = 0;
		
		for(int i = 0; i < matriz.length; i++){
			
			for(int j = 0; j < matriz[i].length; j++){
				
				if((matriz[i][j])%2 == 0){
					
					quantidadePares++;
					
				} else {
					
					quantidadeImpares++;
					
				}
			}
		}
		
		int pares[], impares[];
		
		System.out.print("\n\n - - -> VETOR DE PARES: ");
		if(quantidadePares != 0){
			
			pares = new int[quantidadePares];
			
			int aux = 0;
			for(int i = 0; i < matriz.length; i++){
			
				for(int j = 0; j < matriz[i].length; j++){
					
					if((matriz[i][j])%2 == 0){
						
						pares[aux] = matriz[i][j];
						aux++;
						
					} 
				}
			}
			
			for(int i = 0; i < pares.length; i++){
				System.out.printf("[ %02d ] ", pares[i]);
			}
			
		}else{
			
			System.out.print(" Nao ha pares para o vetor !");
			
		}
		
		System.out.print("\n\n - - -> VETOR DE IMPARES: ");
		if(quantidadeImpares != 0){
			
			impares = new int[quantidadeImpares];
			
			int aux = 0;
			for(int i = 0; i < matriz.length; i++){
			
				for(int j = 0; j < matriz[i].length; j++){
					
					if((matriz[i][j])%2 != 0){
						
						impares[aux] = matriz[i][j];
						aux++;
						
					} 
				}
			}
			
			for(int i = 0; i < impares.length; i++){
				System.out.printf("[ %02d ] ", impares[i]);
			}
			
		}else{
			
			System.out.print(" Nao ha impares para o vetor !");
			
		}

	}
}
