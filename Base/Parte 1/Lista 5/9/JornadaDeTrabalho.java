import java.util.Scanner;

public class JornadaDeTrabalho {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir numero de horas trabalhadas: ");
		int horasTrabalhadas = leia.nextInt();
		
		System.out.print("\n Inserir salario por hora: ");
		double salarioPorHora = leia.nextDouble();
		
		double salarioTotal;
		
		if (horasTrabalhadas > 160){
			
			salarioTotal = (salarioPorHora * 160) + ((salarioPorHora / 2) * (horasTrabalhadas - 160));
			
		} else {
			
			
			salarioTotal = salarioPorHora * horasTrabalhadas;
		}
		
		System.out.print("\n\n Seu salario total e de: R$ " + salarioTotal);
		
	}
}
