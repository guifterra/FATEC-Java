import java.util.Scanner;

public class TesteFraseMaiuscula {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		String fraseUpperCase = frase.toUpperCase();
		
		if(frase == fraseUpperCase){
			
			System.out.print("\n A frase E toda MAIUSCULA !");
			
		} else {
			
			System.out.print("\n A frase NAO E toda MAIUSCULA !");
			
		}
		
	}
}
