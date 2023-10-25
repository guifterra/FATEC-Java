import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		int nota;
		
		// Entrada de dado
		System.out.print("\n Inserir nota: ");
		nota = leia.nextInt();
		
		// Dentro da faixa de 0 a 10?
		if ((nota >= 0) && (nota <= 10)){
		
			// Aprovado ou reprovado?
			if (nota >= 6) {
			
				System.out.print("\n A nota do aluno foi " + nota + " e sua situacao e: APROVADO !");
			
				} else {
				
				System.out.print("\n A nota do aluno foi " + nota + " e sua situacao e: REPROVADO");
				
			}
		
			} else {
			
			System.out.print("\n VALOR INVALIDO !");
			
		}
		
	}
}
