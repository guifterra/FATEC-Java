import java.util.Scanner;
import java.util.Random;

public class Ex03_Lista4 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		while(true){
			
			System.out.print("\n [C] Celsius, [F] Gahrenheit, [K] Kelvin e [S] Sair: : ");
			String decisao = leia.next();
			
			if(decisao.equalsIgnoreCase("C")){
				
				System.out.print("\n Entre com a temperatura: ");
				int temperatura = leia.nextInt();
				
				double temperaturasResultantes[] = new double[2];
				temperaturasResultantes = ConversaoC_FK(temperatura);
				System.out.printf("\n\t F: %.2f F e K: %.2f K \n", temperaturasResultantes[0], temperaturasResultantes[1]);
				
			}else if(decisao.equalsIgnoreCase("F")){
				
				System.out.print("\n Entre com a temperatura: ");
				int temperatura = leia.nextInt();
				
				double temperaturasResultantes[] = new double[2];
				temperaturasResultantes = ConversaoF_CK(temperatura);
				System.out.printf("\n\t C: %.2f C e K: %.2f K \n", temperaturasResultantes[0], temperaturasResultantes[1]);
				
			} else if(decisao.equalsIgnoreCase("K")){
				
				System.out.print("\n Entre com a temperatura: ");
				int temperatura = leia.nextInt();
				
				double temperaturasResultantes[] = new double[2];
				temperaturasResultantes = ConversaoK_CF(temperatura);
				System.out.printf("\n\t C: %.2f C e F: %.2f F \n", temperaturasResultantes[0], temperaturasResultantes[1]);
				
			} else if(decisao.equalsIgnoreCase("S")){
				
				System.out.print("\n\t Fim do programa . . . \n");
				break;
				
			}else {
				
				System.out.print("\n\t Opcao invalida ! \n");
			}
			
		}
		
	}
	
	static double[] ConversaoC_FK(int temperaturaCelsius){
		
		double resultado[] = new double[2];
		
		resultado[0] = (9 * temperaturaCelsius / 5) + 32;
		resultado[1] = temperaturaCelsius + 273;
		return resultado;
		
	}
	
	static double[] ConversaoF_CK(int temperaturaFahrenheit){
		
		double resultado[] = new double[2];
		
		resultado[0] = (5 * (temperaturaFahrenheit - 32)) / 9;
		resultado[1] = resultado[0] + 273;
		return resultado;
		
	}
	
	static double[] ConversaoK_CF(int temperaturaKelvin){
		
		double resultado[] = new double[2];
		
		resultado[0] = temperaturaKelvin - 273;
		resultado[1] = (9 * resultado[0] / 5) + 32;
		return resultado;
		
	}
}
