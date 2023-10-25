import java.util.Scanner;
import java.util.Random;

public class Ex11_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com um valor: ");
		int valor1 = leia.nextInt();
		
		if(valor1 > 0){
			
			if(isPerfect(valor1)){
				
				System.out.printf("\n\t >> O numero %d EH perfeito", valor1);
				
			}else{
				
				System.out.printf("\n\t >> O numero %d NAO EH perfeito", valor1);
				
			}
			
		}else{
			
			System.out.print("\n\t >> Erro! Valor invalido");
			
		}
		
	}
	
	static boolean isPerfect(int v1){
		
		int soma = 0;
		
		for(int aux = v1 - 1; aux >= 1; aux--){
			
			if(v1 % aux == 0)
				soma += aux;
		}
		
		if(soma == v1){
			
			return true;
			
		}else{
			
			return false;
		}
			
		
		
	}
}
