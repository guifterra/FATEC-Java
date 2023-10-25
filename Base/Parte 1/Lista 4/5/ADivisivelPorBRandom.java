import java.util.Random;

public class ADivisivelPorBRandom {

	public static void main(String[] args){
		
		Random gerador = new Random();
		
		int a = gerador.nextInt(1000);
		int b = gerador.nextInt(20);
		
		// teste: a é divisível por b?
		if ((a % b) == 0){
		
			System.out.printf("\n a (%d) EH divisivel por b (%d)", a, b);
		
			} else {
		
			System.out.printf("\n a (%d) NAO eh divisivel por b (%d)", a, b);
		
		}
		
	}
}
