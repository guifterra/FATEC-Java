import java.util.Scanner;

public class MercadoriasEmEstoque {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeMercadorias, aux = 1;
		double precoMercadoria, total = 0, media;
		
		System.out.print("\n Inserir quantidade de mercadorias: ");
		quantidadeDeMercadorias = leia.nextInt();
		
		while (aux <= quantidadeDeMercadorias){
			
			System.out.print("\n Inserir preco da mercadoria " + (aux) + " : ");
			precoMercadoria = leia.nextDouble();
			
			total += precoMercadoria;
			
			aux++;
		}
		
		media = total / quantidadeDeMercadorias;
		
		System.out.printf("\n\n Valor total em estoque: %.2f \n\n Media: %.2f ", total, media);
		
	}
}
