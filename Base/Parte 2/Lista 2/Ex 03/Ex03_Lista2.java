import java.util.Scanner;
import java.util.Random;

public class Ex03_Lista2 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		int resposta;
		double numero;
		
		System.out.print("\n ENTRADA:");
		
		do{
			
			System.out.print("\n\n    Entre com um numero: ");
			numero = leia.nextDouble();
			
			resposta = isZeroPositivoOuNegativo(numero);
			
			switch(resposta){
				
				case 0:
						System.out.print("\n\t O numero " + numero + " e zero");
					break;
					
				case 1:
						System.out.print("\n\t O numero " + numero + " e positivo");
					break;
					
				case -1:
						System.out.print("\n\t O numero " + numero + " e negativo");
					break;
				
			}
			
			if(numero == 0)
				break;
			
		}while(numero != 0);
	}
	
	static int isZeroPositivoOuNegativo(double num){
		
		if(num == 0){
			
			return 0;
			
		}else{
			
			if(num > 0){
				
				return 1;
				
			}else{
				
				return -1;
				
			}
		}
		
	}
}
