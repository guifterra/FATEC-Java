import java.util.Scanner;

public class SequenciaEx26 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int i, j;
		System.out.println("\n Sequencia: \n");
		for (i = 1; i <= 10; i++) {
			
			System.out.print(" " + i + " , ");
			
			for (j = 1; j <= i; j++){
				
				System.out.print(j + " ");
				
			}
			System.out.println("\n");
		}
		
	}
}
