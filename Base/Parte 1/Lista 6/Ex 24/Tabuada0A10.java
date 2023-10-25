import java.util.Scanner;

public class Tabuada0A10 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int i, j;
		
		for (i = 1; i <= 10; i++){
			
			System.out.print("\n\n - - -> TABUADA do " + i + " : \n");
			
			for (j = 0; j <= 10; j++){

				System.out.printf("\n\t %02d x %02d = %03d", i,j, (i * j));
			
			}
			
		}
		
	}
}
