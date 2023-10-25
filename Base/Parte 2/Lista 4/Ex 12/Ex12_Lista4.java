import java.util.Scanner;
import java.util.Random;

public class Ex12_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com um valor: ");
		int valor1 = leia.nextInt();
		
		if(valor1 > 0){
			
			String sequenciaDePerfeitos = achaSequenciaDePerfeitos(valor1);
			System.out.print("\n\t >> " + sequenciaDePerfeitos);
			
		}else{
			
			System.out.print("\n\t >> Erro! Valor invalido");
			
		}
		
	}
	
	static String achaSequenciaDePerfeitos(int v1){
		
		String sequencia = "";
		int soma;
		
		for(int i = 6; i <= v1; i++){
			
			soma = 0;
			
			for(int aux = i - 1; aux >= 1; aux--){
				
				if(i % aux == 0)
					soma += aux;
			}
			
			if(soma == i)
				sequencia += i + " ";
			
		}
		
		return sequencia;
			
		
		
	}
}
