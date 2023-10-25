import java.util.Scanner;

public class SequenciaFibonacci1Ate250 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int a = 0, b = 1, c = 0;
		
		System.out.println();
		
		System.out.print(" 0 1");
		
		while(true){
			
			c = a + b;
			
			if (c > 250)
				break;
			
			System.out.print(" " + c);
			
			a = b;
			b = c;
			
		}
	}
}
