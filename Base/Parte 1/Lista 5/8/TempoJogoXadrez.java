import java.util.Scanner;

public class TempoJogoXadrez {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Inserir hora de inicio do jogo: ");
		int horaInicio = leia.nextInt();
		
		System.out.print("\n Inserir hora de fim do jogo: ");
		int horaFim = leia.nextInt();
		
		int duracao;
		if (horaInicio < horaFim){
		
			duracao = horaFim - horaInicio;
			System.out.print("\n\n A duracao do jogo foi de: " + duracao + "h");
		
		} else {
		
			duracao = 24 - horaInicio + horaFim;
			System.out.print("\n\n A duracao do jogo foi de: " + duracao + "h");
		}
		
	}
}
