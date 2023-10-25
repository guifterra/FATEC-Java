
package ex30;

import java.util.Random;
import java.util.Scanner;

public class Ex30 {

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
        int a,b,c, d;
        
        System.out.print("\n\n - - -> MATRIZ GERADA: \n\n");
        for(int i = 0; i < matriz.length; i++){
            
            a = 0; b = 1; c = 0;
            
            matriz[i] = new int[vetor[i] + 1];
            for(int j = 0; j < matriz[i].length; j++){
                
                if(j == 0){
                    
                    matriz[i][j] = vetor[i];
                    
                }else{
                    
                    matriz[i][j] = a;
                    
                    c = a + b;
                    a = b;
                    b = c;
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
