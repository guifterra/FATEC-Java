import java.util.Scanner;

public class TestePalindromo {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		String testepalindro = "";
		
		for(int i = (frase.length() - 1); i >= 0; i--){
			
			testepalindro += frase.charAt(i);
			
		}
		
		if(frase.equals(testepalindro)){
			
			System.out.print("\n A palavra inserida EH um palindromo!");
			
		} else {
		
			System.out.print("\n A palavra inserida NAO EH um palindromo!");
		
		}
	}
}
