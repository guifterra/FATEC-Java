import java.util.Scanner;

public class Ler10Numeros {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int ok = 0;
		int numerosNegativos = 0;
		while (ok <= 9){
			
			System.out.print("\n Inserir valor: ");
			vetor[ok] = leia.nextInt();
			
			if (vetor[ok] < 0){
			
				numerosNegativos++;
			
			}
			
			ok++;
		}
		
		System.out.print("\n\n Vc inseriu: " + numerosNegativos + " numeros negativos !");
	}
}
