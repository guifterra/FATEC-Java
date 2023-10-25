import java.util.Scanner;

public class SequenciaFibonacci {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeDeTermos = leia.nextInt();
		
		int a = 0, b = 1, c = 0, i;
		
		System.out.print(" 0 1");
		
		for (i = 1; i <= (quantidadeDeTermos - 2); i++){
			
			c = a + b;
			
			System.out.print(" " + c);
			
			a = b;
			b = c;
			
		}
	}
}
