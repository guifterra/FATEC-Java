import java.util.Scanner;

public class Teste8Bits {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		boolean Eh8Bits = true;
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine();
		
		if((frase.length()) == 8){
		
			for(int i = 0; i <= (frase.length() - 1); i++){
				
				if(!(((frase.charAt(i)) == '0') || ((frase.charAt(i)) == '1'))){
					
					Eh8Bits = false;
					break;
					
				}
			}
			
			if(Eh8Bits){
				
				System.out.print("\n A frase inserida EH um numero de 8 bits! ");
				
			} else {
				
				System.out.print("\n A frase inserida NAO EH um numero de 8 bits! ");
				
			}
			
		} else {
			
			System.out.print("\n A frase inserida nao e de 8 bits, pois nao possui exatamente 8 caracteres! ");
			
		}
	}
}
