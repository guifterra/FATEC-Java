import java.util.Scanner;

public class VerificaValorProduto{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		// Leitura valor 1
		System.out.print("\n Inserir valor do produto 1: ");
		int precoProduto1 = leia.nextInt();
		
		// Leitura valor 2
		System.out.print("\n Inserir valor do produto 2: ");
		int precoProduto2 = leia.nextInt();
		
		// Os valores sao validos no intervalo 1 - 1000
		if (((precoProduto1 >= 1) && (precoProduto1 <= 1000)) && ((precoProduto2 >= 1) && (precoProduto2 <= 1000))) {
		
			// Sao iguais?
			if (precoProduto1 == precoProduto2){
			
				System.out.print("\n Os produtos tem o mesmo preco, sendo ele: R$ " + precoProduto1);
			
				} else {
				
				if (precoProduto1 < precoProduto2){
				
					System.out.print("\n O produto 1 (R$ " + precoProduto1 + " ) eh mais barato q o preco do produto 2 (R$ " + precoProduto2 + " )");
				
					} else {
					
					System.out.print("\n O produto 2 (R$ " + precoProduto2 + " ) eh mais barato q o preco do produto 1 (R$ " + precoProduto1 + " )");
					
				}
				
			}
		
			} else {
				
			// Valores INVALIDOS
			System.out.print("\n Um dos valores ou os dois valores são INVALIDOS !");
		}
		
		
		
	}
}
