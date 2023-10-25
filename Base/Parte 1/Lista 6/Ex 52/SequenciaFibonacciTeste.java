import java.util.Scanner;

public class SequenciaFibonacciTeste {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int numero = leia.nextInt();
		
		int a = 0, b = 1, c = 0, i;
		
		boolean noia = false;
		
		for (i = 1; c <= numero; i++){
			
			c = a + b;
			
			if (c == numero)
				noia = true;
			
			
			a = b;
			b = c;
			
		}
		
		if (noia){
			
			System.out.print("\n O valor e da sequencia de fibonacci!");
			
		} else {
			
			System.out.print("\n O valor NAO e da sequencia de fibonacci!");
			
		}
	}
}
