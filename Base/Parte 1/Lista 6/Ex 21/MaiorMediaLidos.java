import java.util.Scanner;

public class MaiorMediaLidos {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux = 1, numero, maior = -2127483648, soma = 0, quantidadeNumeros;
		
		System.out.print("\n Inserir quantidade de numeros: ");
		quantidadeNumeros = leia.nextInt();
		
	
		while (aux <= quantidadeNumeros) {
			
			System.out.print("\n Inserir valor: ");
			numero = leia.nextInt();
			
			soma += numero;
			
			if (maior < numero)
				maior = numero;
			
			aux++;
			
		}
		
		double media = (double)soma / quantidadeNumeros;
		
		System.out.print("\n Maior valor inserido: " + maior);
		System.out.printf("\n Media ..............: %.2f", media);
		
	}
}
