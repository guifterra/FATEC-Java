
package ex29;

import java.util.Scanner;
import java.util.Random;

public class Ex29 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner( System.in );
        Random gerador = new Random();
        
        int quantidadeElementos, matriz[][];
        
        do{
            System.out.print("\n Entre com a quantidade de elementos: ");
            quantidadeElementos = leia.nextInt();
            
        }while(quantidadeElementos <= 2);
        
        int vetor[] = new int[quantidadeElementos];
        
        System.out.print("\n\n - - -> VETOR GERADO: 4");
        for(int i = 0; i < vetor.length; i++){
            
            vetor[i] = gerador.nextInt(10) + 1;
            System.out.printf(" [ %02d ]", vetor[i]);
            
        }
        
        matriz = new int[vetor.length][];
        int primo, d;
        
        System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            
            primo = 1;
            
            matriz[i] = new int[vetor[i] + 1];
            for(int j = 0; j < matriz[i].length; j++){
                
                if(j == 0){
                    
                    matriz[i][j] = vetor[i];
                    
                }else{
                    
                    while(true){
                        
                        d = 0;
                        
                        for(int k = primo; k >= 1; k--){
                            if(primo % k == 0)
                                d++;
                        }
                        
                        primo++;
                        
                        if(d == 2 || d == 1)
                            break;
                        
                        
                    }
                    
                    matriz[i][j] = primo - 1;
                }
                if(j == 0){
                    
                    System.out.printf(" %02d ,", matriz[i][j]);
                    
                }else{
                    
                    System.out.printf(" [ %02d ]", matriz[i][j]);
                }
            }
            System.out.println("\n");
        }
    }
    
}
