import java.util.Scanner;

public class SequenciaEx30 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int i, j;
		System.out.println("\n Sequencia: \n");
		for (i = 1; i <= 10; i++) {
			
			System.out.print(" " + i + " , ");
			
			for (j = ((i % 2) != 0)? 1 : 2; ((i % 2) != 0)? j <= (i + (i - 1)) : j <= (i * 2); j+=2){
				
				System.out.print(j + " ");
				
			}
			System.out.println("\n");
		}
		
	}
}
