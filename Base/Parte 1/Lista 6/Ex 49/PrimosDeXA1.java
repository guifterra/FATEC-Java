import java.util.Scanner;

public class PrimosDeXA1 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeDeTermos = leia.nextInt();
		
		int aux = 1, condicao, x = 1, i, temporario = 0;
		
		while (aux <= quantidadeDeTermos){
			
			condicao = 0;
			
			for(i = x; i >= 1; i--){
				
				if ((x  % i) == 0)
					condicao++;
			}
			
			if (condicao == 2){
				temporario = x;
				aux++;
			}
			
			x++;
		}
		
		while(temporario >= 0){
			
			condicao = 0;
			
			for(i = x; i >= 1; i--){
				
				if ((x  % i) == 0)
					condicao++;
			}
			
			if (condicao == 2){
				System.out.printf(" %d", x);
			}
			
			x--;
			temporario--;
		}
	}
}
