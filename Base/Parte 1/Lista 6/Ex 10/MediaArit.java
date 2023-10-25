import java.util.Scanner;

public class MediaArit {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int ok = 0;
		int numerosNegativos = 0;
		
		double media = 0;
		
		while (ok <= 9){
			
			System.out.print("\n Inserir valor: ");
			vetor[ok] = leia.nextInt();
			
			media += (double)vetor[ok];
			
			ok++;
		}
		
		media = media / 10;
		System.out.printf("\n\n A media dos valores digitados e: %.2f", media);
		
	}
}
