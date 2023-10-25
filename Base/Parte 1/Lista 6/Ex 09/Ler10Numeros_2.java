import java.util.Scanner;

public class Ler10Numeros_2 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int ok = 0;
		int numerosEntre10a20= 0;
		int numerosFora10a20= 0;
		while (ok <= 9){
			
			System.out.print("\n Inserir valor: ");
			vetor[ok] = leia.nextInt();
			
			if ((vetor[ok] >= 10) && (vetor[ok] <= 20)){
			
				numerosEntre10a20++;
			
			} else {
				
				numerosFora10a20++;
				
			}
			
			ok++;
		}
		
		System.out.print("\n\n Quantidade de numeros entre 10 e 20: " + numerosEntre10a20);
		System.out.print("\n Quantidade de numeros fora do intervalo 10 a 20: " + numerosFora10a20);
	}
}
