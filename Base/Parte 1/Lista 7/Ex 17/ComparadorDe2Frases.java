import java.util.Scanner;

public class ComparadorDe2Frases {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a primeira frase: ");
		String frase1 = leia.nextLine();
		
		System.out.print("\n Entre com a segunda  frase: ");
		String frase2 = leia.nextLine();
		
		boolean situacao = false;
		
		if((frase1.length()) == (frase2.length())){
			
			for(int i = 0; i <= (frase1.length() - 1); i++){
				
				if((frase1.charAt(i)) != (frase2.charAt(i))){
					
					situacao = !situacao;
					break;
					
				}
			}
			
			if(situacao){
				
				System.out.print("\n A frase 1 e 2 sao diferentes! ");
				
			} else {
			
				System.out.print("\n A frase 1 e 2 sao IGUAIS! ");
			
			}
			
		} else {
			
			System.out.print("\n As frases nao sao iguais pois nao possuem tamanhos iguais! ");
			
		}
		
	}
}
