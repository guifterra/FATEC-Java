import java.util.Scanner;

public class PrimosDe1AX {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeDeTermos = leia.nextInt();
		
		int aux = 1, condicao, x = 1, i;
		
		while (aux <= quantidadeDeTermos){
			
			condicao = 0;
			
			for(i = x; i >= 1; i--){
				
				if ((x  % i) == 0)
					condicao++;
			}
			
			if (condicao == 2){
				
				System.out.printf(" %d", x);
				aux++;
			}
			
			x++;
		}
	}
}
