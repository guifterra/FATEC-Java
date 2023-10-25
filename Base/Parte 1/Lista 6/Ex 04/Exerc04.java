import java.util.Scanner;

public class Exerc04 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		boolean ok = false;
		
		while (!ok) {
			
			System.out.print("\n Inserir valor maior q zero: ");
			int n = leia.nextInt();
			
			if (n > 0){
					
				ok = true;
					
			} else {
				
				System.out.print("\n Erro: o valor inserido e menor ou igual a 0! . . . \n\n\n");
				
			}
			
			System.out.println();
			
			int aux;
			for (aux = 1; aux <= n; aux++){
					
				System.out.print(" " + aux);
				
			}
			
			
		}
		
	}
}
