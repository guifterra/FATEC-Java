import java.util.Scanner;

public class SalarioComComissao {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir valor do salario fixo: ");
		double salarioFixo = leia.nextDouble();
		
		System.out.print("\n Inserir valor de vendas efetuadas: ");
		double vendasEfetuadas = leia.nextDouble();
		
		double salarioTotal;
		
		if (vendasEfetuadas <= 1500){
			
			salarioTotal = salarioFixo + (vendasEfetuadas * 0.03);
			
		} else {
			
			salarioTotal = salarioFixo + (vendasEfetuadas * 0.05);
			
		}
		
		System.out.print("\n\n Seu salario total e: R$ " + salarioTotal);
	}	
}
