import java.util.Scanner;

public class MediaAritTurma {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir o numero de alunos: ");
		int numeroDeAlunos = leia.nextInt();
		
		double nota, soma = 0, media;
		int aux = 1;
		while (aux <= numeroDeAlunos){
			
			System.out.print("\n Entre com a nota do aluno " + aux + " : ");
			nota = leia.nextDouble();
			
			
			soma += nota;
			
			aux++;
		}
		
		media = soma / numeroDeAlunos;
		
		System.out.print("\n A media arit da sala e: " + media);
		
	}
}
