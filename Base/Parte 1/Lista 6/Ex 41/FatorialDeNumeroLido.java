import java.util.Scanner;

public class FatorialDeNumeroLido {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		long fatorial = 1;
		
		System.out.print("\n Inserir numero para calculo do fat: ");
		numero = leia.nextInt();
		
		long aux = numero;
		
		if (numero > 0){
			
			while (true) {
				
				fatorial *= aux;
				aux --;
				
				if (aux == 1) 
					break;
			}
			
			System.out.print("\n O fatorial de " + numero + " e: " + fatorial);
			
		} else {
			
			System.out.print("\n O valor inserido nao possui fatorial !");
			
		}
		
	}
}
