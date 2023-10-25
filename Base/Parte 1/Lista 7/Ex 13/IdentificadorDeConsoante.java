import java.util.Scanner;

public class IdentificadorDeConsoante {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		char letra;
		int quantidadeConsoantes = 0;
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine().toUpperCase();
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			letra = frase.charAt(i);
			
			if((letra >= 'A') && (letra <= 'Z')){
				switch(letra){
					
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':
						break;
						
					default:
							quantidadeConsoantes++;
						break;
				}
			}
		}
		
		System.out.print("\n A quantidade de consoantes na sua frase e: " + quantidadeConsoantes);
	}
}
