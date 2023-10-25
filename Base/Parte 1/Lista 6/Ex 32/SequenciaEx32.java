import java.util.Scanner;

public class SequenciaEx32 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeNumero = 0, aux = 0, quantidadePositiva = 0;
		
		while (true) {
			
			if (quantidadeDeNumero <= 0){
				
				System.out.print("\n Entre com a quantidade de numeros: ");
				quantidadeDeNumero = leia.nextInt();
				
				quantidadePositiva = quantidadeDeNumero;
				
				if (quantidadeDeNumero == 0) {
					System.out.print("\n Fim do programa . . . ! \n");
					break;
				}
				
				if (quantidadeDeNumero < 0)
					System.out.print("\n Valor Invalido! \n");
					
			} else {
				
				System.out.print(" " + aux);
				aux += 2;
				quantidadePositiva--;
				
				if (quantidadePositiva <= 0)
					break;
				
				System.out.print(",");
			}
			
			
			
		}
		
	}
}
