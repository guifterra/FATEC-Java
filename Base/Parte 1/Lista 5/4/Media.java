import java.util.Scanner;

public class Media {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura de nota 1
		System.out.print("\n Entre com nota 1: ");
		int nota1 = leia.nextInt();
		
		// Leitura de nota 2
		System.out.print("\n Entre com nota 2: ");
		int nota2 = leia.nextInt();
		
		double media;
		
		media = ((double)nota1 + (double)nota2) / 2;
		
		System.out.print("\n Sua media e: " + media);
		
		if (media >= 6){
			
			System.out.print("\n Vc foi APROVADO !");
			
		} else {
		
			System.out.print("\n Vc foi reprovado.");
		
		}
		
	}
}
