import java.util.Scanner;
import java.util.Random;

public class Ex05_Lista2 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		double A, B ,C, delta;
		
		System.out.print("\n ENTRADA:");
		
		do{
			
			System.out.print("\n\n    a: ");
			A = leia.nextDouble();
			
			if(A != 0){
			
				System.out.print("\n\n    b: ");
				B = leia.nextDouble();
				
				System.out.print("\n\n    c: ");
				C = leia.nextDouble();
				
				delta = calculoDelta(A, B, C);
				
				System.out.print("\n\t O delta e " + delta);
				
				if(delta >= 0){
					
					double r1, r2;
					
					r1 = raiz1(A,B,C,delta);
					
					System.out.print("\n\n\t x'  : " + r1);
					
					r2 = raiz2(A,B,C,delta);
					
					System.out.print("\n\n\t x'' : " + r2);
					
				}else{
					
					System.out.print("\n\n\t Raizes sao complexas");
					
				}
				
			}else{
				
				System.out.print("\n\t A equacao nao e do segundo grau! ");
				
			}
			
		}while(A !=0);
	}
	
	static double calculoDelta(double a, double b, double c){
		
		double resultado;
		
		resultado = (b * b) - 4 * a * c;
		
		return resultado;
		
	}
	
	static double raiz1 (double a, double b, double c, double D){
		
		double resultado;
		
		resultado = (-b +(Math.pow(D, (0.5)))) / (2*a);
		
		return resultado;
		
	}
	
	static double raiz2 (double a, double b, double c, double D){
		
		double resultado;
		
		resultado = (-b -(Math.pow(D, (0.5)))) / (2*a);
		
		return resultado;
		
	}
}
