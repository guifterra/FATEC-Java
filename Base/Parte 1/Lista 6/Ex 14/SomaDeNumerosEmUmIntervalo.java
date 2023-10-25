import java.util.Scanner;

public class SomaDeNumerosEmUmIntervalo {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Entre com o primeiro numero: ");
		int numero1 = leia.nextInt();
		
		System.out.print("\n Entre com o segundo numero: ");
		int numero2 = leia.nextInt();
		
		int soma = 0;
		
		while (numero1 <= numero2) {
			
			soma += numero1;
			
			numero1++;
			
		}
		
		System.out.print("\n\n Soma dos valore entre o intervalo: " + soma);
		
	}
}
