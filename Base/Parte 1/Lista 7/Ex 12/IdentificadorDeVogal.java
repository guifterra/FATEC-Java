import java.util.Scanner;

public class IdentificadorDeVogal {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		char letra;
		int quantidadeVogais = 0;
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine().toUpperCase();
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			letra = frase.charAt(i);
			
			switch(letra){
				
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
						quantidadeVogais++;
					break;
			}
		}
		
		System.out.print("\n A quantidade de vogais na sua frase e: " + quantidadeVogais);
	}
}
