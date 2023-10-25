import java.util.Scanner;

public class IdentificarMaiorValor {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir primeiro valor: ");
		int numero1 = leia.nextInt();
		
		System.out.print("\n Inserir segundo valor: ");
		int numero2 = leia.nextInt();
		
		if (numero1 > numero2){
			
			System.out.print("\n\n O maior valor e: " + numero1);
			
		} else {
		
			System.out.print("\n\n O maior valor e: " + numero2);
		
		}
		
	}
}
