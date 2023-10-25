import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		boolean ok = false;
		
		while(!ok){
			
			System.out.print("\n Inserir valor de 1 a 10: ");
			numero = leia.nextInt();
			
			if ((numero >= 1) && (numero <= 10)){
				
				ok = !ok;
				
			} else {
			
				System.out.print("\n Erro: O numero deve estar entre 1-10! \n\n");
				
			}
			
		}
		
		int aux;
		
		System.out.println();
		for (aux = 1; aux <= 10; aux++){
			
			System.out.println(" " + numero + " x " + aux + " = " + (numero * aux));
			
		}
		
		
	}
}
