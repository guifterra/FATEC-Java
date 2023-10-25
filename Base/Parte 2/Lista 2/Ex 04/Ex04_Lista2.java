import java.util.Scanner;
import java.util.Random;

public class Ex04_Lista2 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		double A, B ,C, delta;
		
		System.out.print("\n ENTRADA:");
		
		do{
			
			System.out.print("\n\n    a: ");
			A = leia.nextDouble();
			
			System.out.print("\n\n    b: ");
			B = leia.nextDouble();
			
			System.out.print("\n\n    c: ");
			C = leia.nextDouble();
			
			delta = calculoDelta(A, B, C);
			
			System.out.print("\n\t O delta e " + delta);
			
		}while(A !=0 && B != 0 && C != 0);
	}
	
	static double calculoDelta(double a, double b, double c){
		
		double resultado;
		
		resultado = (b * b) - 4 * a * c;
		
		return resultado;
		
	}
}
