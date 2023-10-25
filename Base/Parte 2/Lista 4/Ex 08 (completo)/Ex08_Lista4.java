import java.util.Scanner;
import java.util.Random;

public class Ex08_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com a quantidade de elementos: ");
		int quantidadeDeElementos = leia.nextInt();
		
		if(quantidadeDeElementos != 0){
			
			if(quantidadeDeElementos > 0){
				
				int elementos[] = new int[quantidadeDeElementos];
				
				for(int i = 0; i < elementos.length; i++){
					
					System.out.print("\n Entre com o elemento: ");
					elementos[i] = leia.nextInt();
					
				}
				
				int MDC = descobreMDC(elementos);
				
				System.out.print("\n\t - - -> O MDC dos numeros eh: " + MDC);
				
			}else{
				
				System.out.print("\n\t - - -> Erro ! Valor invalido");
				
			}
		}
	}
	
	static int descobreMDC(int[] elementos){
		
		int valorDoMDC = 1;
		int d, numero = 2;
		
		while(testaSeEh1(elementos)){
			
			d = 0;
			
			for(int aux = numero; aux >= 1; aux--){
            
            if(numero % aux == 0)
                d++;
			}
			
			if(d == 2){
				
				while(testaSeAlgumEhDivisivel(elementos, numero)){
					
					if(testaSeTodosSaoDivisiveis(elementos, numero))
						valorDoMDC *= numero;
					
					for(int i = 0; i < elementos.length; i++){
						
						if(elementos[i] % numero == 0){
						
							elementos[i] /= numero;
						
						}
						
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
	
	static boolean testaSeAlgumEhDivisivel (int[] vetor, int numero){
		
		for(int i = 0; i < vetor.length; i++){
			
			if(vetor[i] % numero == 0)
				return true;
			
		}
		
		return false;
		
	}
	
	static boolean testaSeTodosSaoDivisiveis (int[] vetor, int numero){
		
		int quantidadeDivisiveis = 0;
		
		for(int i = 0; i < vetor.length; i++){
			
			if(vetor[i] % numero == 0)
				quantidadeDivisiveis++;
			
		}
		
		if(quantidadeDivisiveis == vetor.length){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
}
