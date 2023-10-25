import java.util.Scanner;
import java.util.Random;

public class OrdenacaoCom1For {
	
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
		
				
					
				for(int i = 1; i < ((m.length * m[0].length) * (m.length * m[0].length)); i++){
					
					i = ((i%(m.length * m[0].length))-1)==-1?i+1:i;
					if(m[((i%(m.length * m[0].length))-1) / m[0].length][((i%(m.length * m[0].length))-1) % m[0].length] > m[(i%(m.length * m[0].length)) / m[0].length][(i%(m.length * m[0].length)) % m[0].length]){
						
						int aux;
						aux = m[((i%(m.length * m[0].length))-1) / m[0].length][((i%(m.length * m[0].length))-1) % m[0].length];
						m[((i%(m.length * m[0].length))-1) / m[0].length][((i%(m.length * m[0].length))-1) % m[0].length] = m[(i%(m.length * m[0].length)) / m[0].length][(i%(m.length * m[0].length)) % m[0].length];
						m[(i%(m.length * m[0].length)) / m[0].length][(i%(m.length * m[0].length)) % m[0].length] = aux;
						
					}
					
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

