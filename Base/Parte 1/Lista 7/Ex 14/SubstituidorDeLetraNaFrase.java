import java.util.Scanner;

public class SubstituidorDeLetraNaFrase {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		System.out.print("\n Entre com um caracter: ");
		String entrada = leia.nextLine();
		
		String fraseAlterada = "";
		
		char letra = entrada.charAt(0);
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			if((frase.charAt(i)) == letra){
				
				fraseAlterada += "*";
				
			} else {
				
				fraseAlterada += frase.charAt(i);
				
			}
		}
		
		System.out.print("\n A frase alterada e: " + fraseAlterada);
	}
}
