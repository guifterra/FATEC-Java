import java.util.Scanner;

public class SequenciaEx31 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeNumero = 0, aux = 1;
		
		while (true) {
			
			if (quantidadeDeNumero <= 0){
				
				System.out.print("\n Entre com a quantidade de numeros: ");
				quantidadeDeNumero = leia.nextInt();
				
				if (quantidadeDeNumero == 0) {
					System.out.print("\n Fim do programa . . . ! \n");
					break;
				}
				
				if (quantidadeDeNumero < 0)
					System.out.print("\n Valor Invalido! \n");
					
			} else {
				
				System.out.print(" " + aux);
				aux++;
				
				if (aux > quantidadeDeNumero)
					break;
				
				System.out.print(",");
			}
			
			
			
		}
		
	}
}
