import java.util.Scanner;

public class SequenciaDeNFatoriaisInvertida {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int quantidadeDeTermos, aux,i;
		double fat;
		
		System.out.print("\n Entre com a quantidade de termos na sequencia: ");
		quantidadeDeTermos = leia.nextInt();
		
		System.out.println();
		
		aux = quantidadeDeTermos;
		
		while(aux >= 1){
			
			fat = 1;
			
			for(i = 1; i <= aux; i++)
				fat *= (double)i;
			
			System.out.printf(" %.0f" , fat);
			
			aux--;
		}
		
	}
}
