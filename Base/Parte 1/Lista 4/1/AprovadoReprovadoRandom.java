import java.util.Random;

public class AprovadoReprovadoRandom {
	
	public static void main(String[] args){
		
		Random gerador = new Random();
		int numero = gerador.nextInt(10);
		
		if (numero < 6){
			
			// Reprovado
			System.out.print("\n A nota do aluno foi " + numero + " e o aluno foi: REPROVADO");
			
			}else{
			
			// Aprovado
			System.out.print("\n A nota do aluno foi " + numero + " e o aluno foi: APROVADO");
		}
		
	}
}
