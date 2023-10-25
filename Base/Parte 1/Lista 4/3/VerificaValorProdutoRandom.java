import java.util.Random;

public class VerificaValorProdutoRandom {
	
	public static void main(String[] args){
	
		Random gerador = new Random();
		
		int precoProduto1 = gerador.nextInt(100);
		int precoProduto2 = gerador.nextInt(100);
		
		// Preços iguais?
		if (precoProduto1 == precoProduto2){
		
			System.out.print("\n Os produtos 1 e 2 tem o mesmo preco: " + precoProduto1);
		
			} else {
			
			// Qual é o mais barato?
			if (precoProduto1 < precoProduto2){
			
				System.out.print("\n O produto 1 (R$ " + precoProduto1 + " ) eh mais barato q o produto 2 (R$ " + precoProduto2 + " )");
			
				} else {
				
				System.out.print("\n O produto 2 (R$ " + precoProduto2 + " ) eh mais barato q o produto 1 (R$ " + precoProduto1 + " )");
			}
			
		}
		
	}
}
