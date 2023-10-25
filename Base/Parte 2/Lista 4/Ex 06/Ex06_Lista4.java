import java.util.Scanner;
import java.util.Random;

public class Ex06_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com um valor: ");
		int limite1 = leia.nextInt();
		
		System.out.print("\n Entre com outro valor: ");
		int limite2 = leia.nextInt();
		
		if(limite1 > limite2){
			
			int aux = limite1;
			limite1 = limite2;
			limite2 = aux;
			
		}
		
		int vetorPrimos[] = criaVetorPrimos(limite1, limite2);
		
		System.out.print("\n\n\t - - -> VETOR DE PRIMOS IDENTIFICADO: \n\n\t >>");
		for(int i = 0; i < vetorPrimos.length; i++){
			
			System.out.print(" " + vetorPrimos[i]);
			
		}
		
	}
	
	static int[] criaVetorPrimos(int limiteInferior, int limiteSuperior){
		
		int quantidade = 0;
		
		for(int i = limiteInferior; i <= limiteSuperior; i++){
			
			if(isPrimo(i))
				quantidade++;
			
		}
		
		int vetor[] = new int[quantidade];
		int v1 = limiteInferior;
		
		for(int i = 0; i < vetor.length; i++){
			
			while(true){
				
				v1++;
				
				if(isPrimo(v1 - 1))
					break;
				
			}
			vetor[i] = v1 - 1;
			
		}
		
		return vetor;
		
	}
	
	static boolean isPrimo(int numero){
        
        int d = 0;
        boolean resultado = false;
        
        for(int aux = numero; aux >= 1; aux--){
            
            if(numero % aux == 0)
                d++;
            
        }
        
        if(d == 2)
            resultado = true;
        
        return resultado;
    }
}
