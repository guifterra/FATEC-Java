import java.util.Scanner;
import java.util.Random;

public class Ex02_Lista2 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		boolean resposta;
		double numero;
		
		System.out.print("\n ENTRADA:");
		
		do{
			
			System.out.print("\n\n    Entre com um numero: ");
			numero = leia.nextDouble();
			
			resposta = isZero(numero);
			
			if(resposta){
				
				System.out.print("\n\t O numero " + numero + " e zero");
				
			}else{
				
				System.out.print("\n\t O numero " + numero + " nao e zero");
				
			}
			
			if(numero == 0)
				break;
			
		}while(numero != 0);
	}
	
	static boolean isZero(double num){
		
		if(num == 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
}
