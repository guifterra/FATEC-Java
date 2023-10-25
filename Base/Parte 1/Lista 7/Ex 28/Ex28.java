import java.util.Scanner;

public class Ex28 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com uma frase: ");
		String frase = leia.nextLine();
		
		String fraseDobrada = "";
		if(((frase.length()) % 2) == 0){
				
			// Par
			for(int i = 0; i <= frase.length() / 2; i++){
				
				fraseDobrada += frase.charAt(i);
				fraseDobrada += frase.charAt((frase.length() - 1 - i));
				
			}
			
			System.out.print("\n\n Saida: " + fraseDobrada);
				
		} else {
			
			// Impar
			for(int i = 0; i != ((frase.length() + 1 / 2) - 1); i++){
				
				fraseDobrada += frase.charAt(i);
				if(i == ((frase.length() / 2) + 1) - 1)
					break;
				fraseDobrada += frase.charAt((frase.length() - 1 - i));
				
			}
			
			System.out.print("\n\n Saida: " + fraseDobrada);
		}
		
	}
}
