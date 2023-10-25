import java.util.Scanner;
import java.util.Random;

public class OrdenacaoCom2For {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random gerador = new Random();
		
		int linha, coluna, m[][];
		
		do{
			
			System.out.print("\n Entre com a quantidade: ");
			linha = leia.nextInt();
			
		}while(linha <= 1);
		
		do{
			
			System.out.print("\n Entre com a quantidade: ");
			coluna = leia.nextInt();
			
		}while(coluna <= 1);
		
		m = new int[linha][coluna];
		
		System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
		for(int i = 0; i < m.length; i++){
			
			for(int j = 0; j < m[i].length; j++){
				
				m[i][j] = gerador.nextInt(20 + 1);
				System.out.printf("  [ %02d ]", m[i][j]);
				
			}
			System.out.println("\n");
		}
		
		// --------------------------
		
				int menor, aux;
						
				for(int a = 0; a < m.length * m[0].length; a++){
					
					menor = m[a / m[0].length][a % m[0].length];
					
					for(int i = 0 + a; i < m.length * m[0].length; i++){
						
						if(menor > m[i / m[0].length][i % m[0].length]){
							
							aux = menor;
							menor = m[i / m[0].length][i % m[0].length];
							m[i / m[0].length][i % m[0].length] = aux;
							
						}
						
					}
					
					m[a / m[0].length][a % m[0].length] = menor;
				}
				// System.out.print("\n\n - - -> MENOR VALOR: " + menor + "\n\n");
		
		// ---------------------------
		
		System.out.print("\n\n - - -> MATRIZ ORDENADA: \n\n");
		for(int i = 0; i < m.length; i++){
			
			for(int j = 0; j < m[i].length; j++){
				
				System.out.printf("  [ %02d ]", m[i][j]);
				
			}
			System.out.println("\n");
		}
	}
}

