import java.util.Scanner;

public class SomaNumerosMenoresQ40 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int aux = 1;
		int numero, soma = 0;
		
		while (aux <= 10){
			
			System.out.print("\n Entre com algum numero: ");
			numero = leia.nextInt();
			
			if (numero < 40)
			soma += numero;
			
			aux++;
			
		}
		
		System.out.print("\n\n A soma dos numeros menores q 40 inseridos e: " + soma);
		
	}
}
