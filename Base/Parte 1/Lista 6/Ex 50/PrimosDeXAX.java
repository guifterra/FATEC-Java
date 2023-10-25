import java.util.Scanner;

public class PrimosDeXAX {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a quantidade de termos: ");
		int quantidadeDeTermos = leia.nextInt();
		
		int aux = 1, condicao, x , i;
		
		System.out.print("\n Entre com a o termo inicial da seq: ");
		x = leia.nextInt();
		
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
