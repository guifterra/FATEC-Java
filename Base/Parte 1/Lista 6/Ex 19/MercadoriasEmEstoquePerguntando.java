import java.util.Scanner;

public class MercadoriasEmEstoquePerguntando {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		
		int aux = 1;
		double precoMercadoria, total = 0, media;
		
		String decisao;
		
		while (true){
			
			System.out.print("\n Inserir preco da mercadoria " + (aux) + " : ");
			precoMercadoria = leia.nextDouble();
			
			total += precoMercadoria;
			
			while (true){
				
				System.out.print("\n Deseja inserir +1 produto? (S/N) : ");
				decisao = leiaStr.next();
				
				if ((decisao.equalsIgnoreCase("S")) || (decisao.equalsIgnoreCase("N")))
					break;
				
			}
			
			if ((decisao.equalsIgnoreCase("N")))
					break;
			
			aux++;
		}
		
		media = total / aux;
		
		System.out.printf("\n\n Valor total em estoque: %.2f \n\n Media: %.2f ", total, media);
		
	}
}
