import java.util.Scanner;

public class SequenciaFibonacciInicioFim {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com inicio dos termos: ");
		int numeroInicial = leia.nextInt();
		
		System.out.print("\n Entre com fim dos termos: ");
		int numeroFinal = leia.nextInt();
		
		int a = 0, b = 1, c = 0, i;
		
		boolean noia = false;
		
		System.out.println();
		
		if (numeroInicial <= 2){
			if (numeroInicial == 1){
				System.out.print(" 0 1");
			} else {
				System.out.print(" 1");
			}
		}
		
		for (i = 3; i <= numeroFinal; i++){
			
			c = a + b;
			
			if (i >= numeroInicial)
				System.out.print(" " + c);
			
			
			a = b;
			b = c;
			
		}
	}
}
