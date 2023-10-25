import java.util.Scanner;
import java.util.Random;

public class Ex01_Lista4 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com a temperatura em Celsius: ");
		int Celsius = leia.nextInt();
		
		double Fahrenheit = ConversaoCF(Celsius);
		
		System.out.print("\n\t A temperatura em Fahrenheit e: " + Fahrenheit + " F");
	}
	
	static double ConversaoCF(int temperaturaCelsius){
		
		int resultado;
		
		resultado = (9 * temperaturaCelsius / 5) + 32;
		return resultado;
		
	}
}
