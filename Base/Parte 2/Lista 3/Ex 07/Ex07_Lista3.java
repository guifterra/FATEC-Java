import java.util.Scanner;
import java.util.Random;

public class Ex07_Lista3 {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		System.out.print("\n ENTRADA: ");
		
		while(true){
			
			String decisao;
			
			System.out.print("\n\n    Jogar o dado[s/n]: ");
			decisao = leiaStr.next();
			
			if(decisao.equalsIgnoreCase("n"))
				break;
			
			int resultadoDoDado = dado();
			System.out.print("\n\t Saiu: " + resultadoDoDado);
			
		}
		System.out.print("\n\t Fim do programa . . . \n");
			
	}
	
	static int dado(){
		
		Random gerador = new Random();
		int resultado = gerador.nextInt(6); 
		return resultado + 1;
		
	}
}
