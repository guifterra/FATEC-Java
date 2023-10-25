import java.util.Scanner;
import java.util.Random;

public class Ex02_Lista4 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		while(true){
			
			System.out.print("\n [C] Celsius, [F] Gahrenheit e [S] Sair: : ");
			String decisao = leia.next();
			
			if(decisao.equalsIgnoreCase("C")){
				
				System.out.print("\n Entre com a temperatura: ");
				int temperatura = leia.nextInt();
				
				double Fahrenheit = ConversaoCF(temperatura);
				System.out.printf("\n\t A temperatura de %d C em Fahrenheit e: %.2f F\n", temperatura, Fahrenheit);
				
			}else if(decisao.equalsIgnoreCase("F")){
				
				System.out.print("\n Entre com a temperatura: ");
				int temperatura = leia.nextInt();
				
				double Celsius = ConversaoFC(temperatura);
				System.out.printf("\n\t A temperatura de  %d F em Celsius e: %.2f C\n", temperatura, Celsius);
				
			} else if(decisao.equalsIgnoreCase("S")){
				
				System.out.print("\n\t Fim do programa . . . \n");
				break;
				
			}else {
				
				System.out.print("\n\t Opcao invalida ! \n");
			}
			
		}
		
	}
	
	static double ConversaoCF(int temperaturaCelsius){
		
		int resultado;
		
		resultado = (9 * temperaturaCelsius / 5) + 32;
		return resultado;
		
	}
	
	static double ConversaoFC(int temperaturaFahrenheit){
		
		int resultado;
		
		resultado = (5 * (temperaturaFahrenheit - 32)) / 9;
		return resultado;
		
	}
}
