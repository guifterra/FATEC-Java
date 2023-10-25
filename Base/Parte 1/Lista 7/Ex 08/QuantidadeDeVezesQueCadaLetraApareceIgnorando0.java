import java.util.Scanner;

public class QuantidadeDeVezesQueCadaLetraApareceIgnorando0 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine().toUpperCase();
		
		int quantidadeRepetida;
		
		for(char letra = 'A'; letra <= 'Z'; letra++){
			
			quantidadeRepetida = 0;
			
			for(int aux = 0; aux < (frase.length()); aux++){
				
				if((frase.charAt(aux)) == letra)
					quantidadeRepetida++;
			}
			
			switch(quantidadeRepetida){
				
				case 0:
					break;
					
				case 1:
						System.out.printf("\n\n -> a letra '%s' foi repetida: %d vez", letra, quantidadeRepetida);
					break;
					
				default:
						System.out.printf("\n\n -> a letra '%s' foi repetida: %d vezes", letra, quantidadeRepetida);
					break;
				
			}
		}
		
	}
}
