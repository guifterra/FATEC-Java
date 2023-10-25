import java.util.Scanner;
import java.util.Random;

public class Ex10_Lista4{
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner ( System.in );
		Random gerador = new Random();
		
		System.out.print("\n Entre com a quantidade de elementos: ");
		int quantidadeDeElementos = leia.nextInt();
		
		if(quantidadeDeElementos != 0){
			
			if(quantidadeDeElementos > 1){
				
				int elementos[] = new int[quantidadeDeElementos];
				
				for(int i = 0; i < elementos.length; i++){
					
					System.out.print("\n Entre com o elemento: ");
					elementos[i] = leia.nextInt();
					
				}
				
				int MMC = descobreMMC(elementos);
				
				System.out.print("\n\t - - -> O MMC dos numeros eh: " + MMC);
				
			}else{
				
				System.out.print("\n\t - - -> Erro ! Valor invalido");
				
			}
		}
	}
	
	static int descobreMMC(int[] elementos){
		
		int valorDoMMC = 1;
		int d, numero = 2;
		
		while(testaSeEh1(elementos)){
			
			d = 0;
			
			for(int aux = numero; aux >= 1; aux--){
            
            if(numero % aux == 0)
                d++;
			}
			
			if(d == 2){
				
				while(testaSeAlgumEhDivisivel(elementos, numero)){
					
						valorDoMMC *= numero;
					
					for(int i = 0; i < elementos.length; i++){
						
						if(elementos[i] % numero == 0){
						
							elementos[i] /= numero;
						
						}
						
					}
					
				}
				
			}
			
			numero++;
			
		}
		
		return valorDoMMC;
		
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
		
		int quantidadeDeUns = 0;
		
		for(int i = 0; i < vetor.length; i++){
			
			if(vetor[i] == 1)
				quantidadeDeUns++;
			
		}
		
		if(quantidadeDeUns == vetor.length){
			
			return false;
			
		}else{
			
			return true;
			
		}
		
		
	}
	
	static boolean testaSeAlgumEhDivisivel (int[] vetor, int numero){
		
		for(int i = 0; i < vetor.length; i++){
			
			if(vetor[i] % numero == 0)
				return true;
			
		}
		
		return false;
		
	}
}
