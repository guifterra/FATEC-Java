import java.util.Scanner;
import java.util.Random;

public class Ex08_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com a quantidade de elementos: ");
		int quantidadeDeElementos = leia.nextInt();
		
		int elementos[] = new int[quantidadeDeElementos];
		
		for(int i = 0; i < elementos.length; i++){
			
			System.out.print("\n Entre com o elemento: ");
			elementos[i] = leia.nextInt();
			
		}
		
		int MDC = descobreMDC(elementos);
		
		System.out.print("\n\t - - -> O MDC dos numeros eh: " + MDC);
		
	}
	
	static int[] descobreMDC(int[] elementos){
		
		int valorDoMDC = 1;
		int d, numero = 2;
		
		while(testaSeEh1(elementos)){
			
			d = 0;
			
			for(int aux = numero; aux >= 1; aux--){
            
            if(numero % aux == 0)
                d++;
			}
			
			if(d == 2){
				
				while((v1 % numero == 0) || (v2 % numero == 0)){
					
					if((v1 % numero == 0) && (v2 % numero == 0))
						valorDoMDC *= numero;
						
					if(v1 % numero == 0){
						
						v1 /= numero;
						
					}
					
					if(v2 % numero == 0){
						
						v2 /= numero;
						
					}
					
				}
				
			}
			
			numero++;
			
		}
		
		return valorDoMDC;
		
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
    
    static boolean testaSeEh1 (int[] vetor){
		
		for(int i = 0; i < vetor.length; i++){
			
			if(vetor[i] == 1)
				return false;
			
		}
		
		return true;
		
	}
}
