import java.util.Scanner;

public class QuantidadeMaiusculas{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		int quantidadeMaiusculas = 0;
		
		for(int aux = 0; aux < frase.length(); aux++){
			
			if(((frase.toUpperCase().charAt(aux)) == (frase.charAt(aux))) && ((frase.charAt(aux)) != ' '))
				quantidadeMaiusculas++;
		}
		
		System.out.printf("\n A frase possui: %d letras maiusculas", quantidadeMaiusculas);
		
	}
}
