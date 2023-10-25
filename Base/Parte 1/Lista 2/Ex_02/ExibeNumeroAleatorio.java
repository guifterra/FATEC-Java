import java.util.Random;

public class ExibeNumeroAleatorio {
	
	public static void main(String[] args){
		
		Random random = new Random();
		
		double numero = random.nextDouble(100);
		
		System.out.printf("\n O numero gerado foi: %.2f", numero);
		
	}
}
