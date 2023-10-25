import java.util.Scanner;
import java.util.Random;

public class Ex07_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com um valor: ");
		int valor1 = leia.nextInt();
		
		System.out.print("\n Entre com outro valor: ");
		int valor2 = leia.nextInt();
		
		int MDC = descobreMDC(valor1, valor2);
		
		System.out.print("\n\t - - -> O MDC dos numeros eh: " + MDC);
		
	}
	
	static int descobreMDC(int v1, int v2){
		
		int valorDoMDC = 1;
		int d, numero = 2;
		
		while((v1 != 1) && (v2 != 1)){
			
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
}
