import java.util.Scanner;

public class MaiorMenorDeCemValores {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux = 2, numero, maior, menor;
		
		System.out.print("\n Inserir valor: ");
		numero = leia.nextInt();
		
		maior = numero;
		menor = numero;
		
		while (aux <= 100) {
			
			System.out.print("\n Inserir valor: ");
			numero = leia.nextInt();
			
			if (maior < numero)
				maior = numero;
				
			if (menor > numero)
				menor = numero;
			
			
			aux++;
			
		}
		
		System.out.print("\n Maior valor inserido: " + maior);
		System.out.print("\n Menor valor inserido: " + menor);
		
	}
}
