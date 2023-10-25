import java.util.Scanner;

public class CompraMacas {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura de numero de Macas
		System.out.print("\n Entre com um numero: ");
		int numeroMacas = leia.nextInt();
		
		double custoTotal;
		
		// teste
		if (numeroMacas < 12){
			
			custoTotal = numeroMacas * 1.3;
			System.out.printf("\n Comprando %d Macas o preco a pagar sera: R$ %.2f", numeroMacas, custoTotal);
			
		} else {
		
			custoTotal = numeroMacas;
			System.out.printf("\n Comprando %d Macas o preco a pagar sera: R$ %.2f", numeroMacas, custoTotal);
		
		}
		
	}
}
