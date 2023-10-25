import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[15];
		
		for(int i = 0; i <= 14; i++){
			
			System.out.print("\n Entre com um valor ( " + i + " ): ");
			vetor[i] = leia.nextInt();
			
		}
		
		System.out.print("\n\n - - -> INFORMACOES DO VETOR: \n");
		
		for(int i = 0; i <= 14; i ++)
			System.out.printf("\n Vetor [ %02d ] = %d", i, vetor[i]);
		
	}
}
