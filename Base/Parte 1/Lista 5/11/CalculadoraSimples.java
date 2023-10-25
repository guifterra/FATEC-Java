import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner (System.in);
		
		System.out.print("\n Inserir primeiro numero: ");
		double numero1 = leia.nextDouble();
		
		System.out.print("\n Inserir segundo numero.: ");
		double numero2 = leia.nextDouble();
		
		System.out.print("\n Inserir operacao (+, -, * ou /): ");
		String operacaoStr = leia.next();
		
		String operacao = operacaoStr;
		double calculo;
		
		switch (operacao){
				
			case "+":
					
					calculo = numero1 + numero2;
					System.out.print("\n\n " + numero1 + " + " + numero2 + " = " + calculo);
					
				break;
				
			case "-":
					
					calculo = numero1 - numero2;
					System.out.print("\n\n " + numero1 + " - " + numero2 + " = " + calculo);
					
				break;
				
			case "*":
					
					calculo = numero1 * numero2;
					System.out.print("\n\n " + numero1 + " * " + numero2 + " = " + calculo);
					
				break;
				
			case "/":
					
					calculo = numero1 / numero2;
					System.out.print("\n\n " + numero1 + " / " + numero2 + " = " + calculo);
					
				break;
			
		}
		
	}
}
