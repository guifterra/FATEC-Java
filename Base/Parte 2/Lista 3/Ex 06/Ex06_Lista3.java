import java.util.Scanner;
import java.util.Random;

public class Ex06_Lista3 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		Random gerador = new Random();
		
		int numero1, numero2, menor;
		
		System.out.print("\n ENTRADA:");
		
			System.out.print("\n\n    Entre com um numero inteiro   : ");
			numero1 = leia.nextInt();
			
			numero2 = numero1;
		
		while(true){
			
			menor = IdentificaMenor(numero1, numero2);
			
			String decisao;
			
			System.out.print("\n    Inserir outro[s/n]: ");
			decisao = leiaStr.next();
			
			if(decisao.equalsIgnoreCase("n"))
				break;
			
			System.out.print("\n    Entre com outro numero inteiro: ");
			numero2 = leia.nextInt();
			
		}
		System.out.print("\n\t O menor valor e: " + menor);
			
	}
	
	static int IdentificaMenor(int a, int b){
		
		return Math.min(a,b);
		
	}
}
