import java.util.Scanner;
import java.util.Random;

public class Ex05_Lista3 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int numero1, numero2, numero3, maior;
		
		System.out.print("\n ENTRADA:");
		
			System.out.print("\n\n    Entre com um numero inteiro ..: ");
			numero1 = leia.nextInt();
			
			System.out.print("\n    Entre com outro numero inteiro: ");
			numero2 = leia.nextInt();
			
			System.out.print("\n    Entre com outro numero inteiro: ");
			numero3 = leia.nextInt();
			
		maior = IdentificaMaior(numero1, numero2, numero3);
		
		System.out.print("\n\t O maior valor e: " + maior);
			
	}
	
	static int IdentificaMaior(int a, int b, int c){
		
		int maiorDosDois = IdentificaMaior(a, b);
		return Math.max(maiorDosDois,c);
		
	}
	
	static int IdentificaMaior(int a, int b){
		
		return Math.max(a,b);
		
	}
}
