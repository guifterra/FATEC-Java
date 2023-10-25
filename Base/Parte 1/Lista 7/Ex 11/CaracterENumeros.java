import java.util.Scanner;

public class CaracterENumeros{
	
	public static void main(String[] args){
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com a frase: ");
		String frase = leia.nextLine().toUpperCase();
		
		int quantidadeLestras = 0;
		int quantidadeNumeros = 0;
		int outros = 0;
		int letra;
		
		for(int i = 0; i <= (frase.length() - 1); i++){
			
			if((frase.charAt(i) >= 'A') && (frase.charAt(i) <= 'Z')){
			
				quantidadeLestras++;
				
			} else if((frase.charAt(i) >= '0') && (frase.charAt(i) <= '9')){
			
				quantidadeNumeros++;
				
			} else {
			
				outros++;
			}
		}
		
		System.out.print("\n -> Quantidade de letras.: " + quantidadeLestras);
		System.out.print("\n -> Quantidade de numeros: " + quantidadeNumeros);
		System.out.print("\n -> Quantidade de carac e: " + outros);
	
	}
}
