import java.util.Scanner;

public class SequenciaEx40 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, aux = 1;
		boolean chegouNaMetade = false;
		
		System.out.print("\n Inserir numero: ");
		numero = leia.nextInt();
		
		while(true){
			
			if (numero == 0){
				System.out.print("\n Fim do programa . . .");
				break;
			}
			
			if (numero > 0){
			
				System.out.print(" " + aux);
				
				if ((numero % 2) == 0) {
					
					if ((aux <= (numero / 2)) && !(chegouNaMetade)){
						
						aux++;
						
						if (aux == (numero / 2 + 1)) {
							chegouNaMetade = true;
							aux--;
					}
						
					} else {
						
						aux--;
						
					}
					
					if (aux == 0)
						break;
					System.out.print(",");
				
				} else {
					
					if ((aux <= ((numero + 1) / 2)) && !(chegouNaMetade)){
						
						aux++;
						
						if (aux == ((numero + 1) / 2)) {
							chegouNaMetade = true;
						}
						
					} else {
						
						aux--;
						
					}
					
					if (aux == 0)
						break;
					System.out.print(",");
					
				}
			
			} else {
				
				System.out.print("\n Entre com um valor Valido ! (0 ou maior) \n\n");
				
				System.out.print("\n Inserir numero: ");
				numero = leia.nextInt();
				
			}
		}
		
	}
}
