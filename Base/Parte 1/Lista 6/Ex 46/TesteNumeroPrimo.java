import java.util.Scanner;

public class TesteNumeroPrimo {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int numero, i, condicao = 0;
		
		System.out.print("\n Entre com um numero: ");
		numero = leia.nextInt();
		
		for(i = numero; i >= 1; i--){
			
			if ((numero % i) == 0)
				condicao++;
			
		}
		
		if (condicao == 2){
			
			System.out.printf("\n O numero %d e primo!", numero);
			
		} else {
			
			System.out.printf("\n O numero %d NAO e primo!", numero);
		}
	}
}
