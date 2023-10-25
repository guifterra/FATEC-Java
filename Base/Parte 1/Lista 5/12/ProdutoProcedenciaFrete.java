import java.util.Scanner;

public class ProdutoProcedenciaFrete {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir preco do produto: ");
		double preco = leia.nextDouble();
		
		System.out.print("\n Inserir codigo de origem do produto: ");
		int codigo = leia.nextInt();
		
		switch (codigo) {
			
			case 1:
				
					System.out.println("\n\n Preco do Produto ....: R$ " + preco);
					System.out.println(" Procedencia .........: Norte");
					System.out.println(" Frete ...............: R$ " + (preco * 0.1));
					System.out.println(" Preco Total .........: R$ " + (preco + (preco * 0.1)));
				
				break;
				
			case 2,5,9:
			
					System.out.println("\n\n Preco do Produto ....: R$ " + preco);
					System.out.println(" Procedencia .........: Sul");
					System.out.println(" Frete ...............: R$ " + (preco * 0.03));
					System.out.println(" Preco Total .........: R$ " + (preco + (preco * 0.03)));
			
				break;
			
			case 3,10,11,12,13,14,15:
			
					System.out.println("\n\n Preco do Produto ....: R$ " + preco);
					System.out.println(" Procedencia .........: Leste");
					System.out.println(" Frete ...............: R$ " + (preco * 0.012));
					System.out.println(" Preco Total .........: R$ " + (preco + (preco * 0.012)));
			
				break;
				
			case 7,20:
			
					System.out.println("\n\n Preco do Produto ....: R$ " + preco);
					System.out.println(" Procedencia .........: Oeste");
					System.out.println(" Frete ...............: R$ " + (preco * 0.073));
					System.out.println(" Preco Total .........: R$ " + (preco + (preco * 0.073)));
			
				break;
				
			default:
			
					System.out.println("\n\n Preco do Produto ....: R$ " + preco);
					System.out.println(" Procedencia .........: Importado");
					System.out.println(" Frete ...............: R$ " + (preco * 0.222));
					System.out.println(" Preco Total .........: R$ " + (preco + (preco * 0.222)));
			
				break;
			
		}
		
	}
}
