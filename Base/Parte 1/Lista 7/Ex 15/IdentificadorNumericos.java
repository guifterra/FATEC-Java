import java.util.Scanner;

public class IdentificadorNumericos {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		int quantidadeNumericos = 0;
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			if((frase.charAt(i) >= '0') && (frase.charAt(i) <= '9'))
				quantidadeNumericos++;
			
		}
		
		System.out.print("\n A quantidade de carac numericos na frase e: " + quantidadeNumericos);
	}
}
