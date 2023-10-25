import java.util.Scanner;

public class SalariosCidade {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		double salario, somaSalarios = 0, maiorSalario = 0;
		int numeroDeFilhos, somaNumeroFilhos = 0, aux = 0, quantidadeSalariomenor150 = 0;
		
		while(true){
			
			System.out.print("\n Entre com o salario .....: ");
			salario = leia.nextDouble();
			
			if (salario < 0)
				break;
			
			if (salario < 150)
				quantidadeSalariomenor150++;
			
			if (maiorSalario < salario)
				maiorSalario = salario;
			
			aux++;
			
			System.out.print("\n Entre com o num de filhos: ");
			numeroDeFilhos = leia.nextInt();
			
			System.out.println();
			
			somaSalarios += salario;
			somaNumeroFilhos += numeroDeFilhos;
			
			
		}
		
		System.out.printf("\n Media de salario da populacao : R$ %.2f", (somaSalarios / aux));
		System.out.printf("\n Media do numero de filhos ....: %d", (somaNumeroFilhos / aux));
		System.out.printf("\n Maior salario lido ...........: R$ %.2f", (maiorSalario));
		System.out.printf("\n Percentual de pessoas S < 150 : %.2f %%", ((double)quantidadeSalariomenor150 / aux * 100));
		
		
		
	}
}
